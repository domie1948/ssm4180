package com.entity.view;

import com.entity.TiwenhuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 体温汇报
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("tiwenhuibao")
public class TiwenhuibaoView extends TiwenhuibaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 是否不适的值
		*/
		private String shifouValue;
		/**
		* 体温状态的值
		*/
		private String tiwenValue;



		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 所属学校
			*/
			private Integer xuexiaoTypes;
				/**
				* 所属学校的值
				*/
				private String xuexiaoValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public TiwenhuibaoView() {

	}

	public TiwenhuibaoView(TiwenhuibaoEntity tiwenhuibaoEntity) {
		try {
			BeanUtils.copyProperties(this, tiwenhuibaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否不适的值
			*/
			public String getShifouValue() {
				return shifouValue;
			}
			/**
			* 设置： 是否不适的值
			*/
			public void setShifouValue(String shifouValue) {
				this.shifouValue = shifouValue;
			}
			/**
			* 获取： 体温状态的值
			*/
			public String getTiwenValue() {
				return tiwenValue;
			}
			/**
			* 设置： 体温状态的值
			*/
			public void setTiwenValue(String tiwenValue) {
				this.tiwenValue = tiwenValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
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
					* 获取： 所属学校
					*/
					public Integer getXuexiaoTypes() {
						return xuexiaoTypes;
					}
					/**
					* 设置： 所属学校
					*/
					public void setXuexiaoTypes(Integer xuexiaoTypes) {
						this.xuexiaoTypes = xuexiaoTypes;
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
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


}
