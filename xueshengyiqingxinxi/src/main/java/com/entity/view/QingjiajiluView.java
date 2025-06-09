package com.entity.view;

import com.entity.QingjiajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("qingjiajilu")
public class QingjiajiluView extends QingjiajiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 审批状态的值
		*/
		private String qingjiajiluValue;



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

	public QingjiajiluView() {

	}

	public QingjiajiluView(QingjiajiluEntity qingjiajiluEntity) {
		try {
			BeanUtils.copyProperties(this, qingjiajiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审批状态的值
			*/
			public String getQingjiajiluValue() {
				return qingjiajiluValue;
			}
			/**
			* 设置： 审批状态的值
			*/
			public void setQingjiajiluValue(String qingjiajiluValue) {
				this.qingjiajiluValue = qingjiajiluValue;
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
