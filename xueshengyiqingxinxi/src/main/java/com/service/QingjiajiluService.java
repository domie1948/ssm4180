package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingjiajiluEntity;
import java.util.Map;

/**
 * 请假信息 服务类
 * @author 
 * @since 2021-05-06
 */
public interface QingjiajiluService extends IService<QingjiajiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}