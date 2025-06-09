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

import com.dao.TiwenhuibaoDao;
import com.entity.TiwenhuibaoEntity;
import com.service.TiwenhuibaoService;
import com.entity.view.TiwenhuibaoView;

/**
 * 体温汇报 服务实现类
 * @author 
 * @since 2021-05-06
 */
@Service("tiwenhuibaoService")
@Transactional
public class TiwenhuibaoServiceImpl extends ServiceImpl<TiwenhuibaoDao, TiwenhuibaoEntity> implements TiwenhuibaoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<TiwenhuibaoView> page =new Query<TiwenhuibaoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
