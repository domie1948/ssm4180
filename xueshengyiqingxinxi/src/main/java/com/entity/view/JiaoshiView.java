package com.entity.view;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiaoshi")
public class JiaoshiView extends JiaoshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 所属学校的值
		*/
		private String xuexiaoValue;



	public JiaoshiView() {

	}

	public JiaoshiView(JiaoshiEntity jiaoshiEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 所属学校的值
			*/
			public String getXuexiaoValue() {
				return xuexiaoValue;
			}
			/**
			* 设置： 所属学校的值
			*/
			public void setXuexiaoValue(String xuexiaoValue) {
				this.xuexiaoValue = xuexiaoValue;
			}










}
