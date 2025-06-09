package com.dao;

import com.entity.TiwenhuibaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TiwenhuibaoView;

/**
 * 体温汇报 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface TiwenhuibaoDao extends BaseMapper<TiwenhuibaoEntity> {

   List<TiwenhuibaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
