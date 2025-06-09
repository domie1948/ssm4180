package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.QingjiajiluDao;
import com.entity.QingjiajiluEntity;
import com.service.QingjiajiluService;
import com.entity.view.QingjiajiluView;

/**
 * 请假信息 服务实现类
 * @author 
 * @since 2021-05-06
 */
@Service("qingjiajiluService")
@Transactional
public class QingjiajiluServiceImpl extends ServiceImpl<QingjiajiluDao, QingjiajiluEntity> implements QingjiajiluService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<QingjiajiluView> page =new Query<QingjiajiluView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
