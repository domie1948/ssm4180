package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 请假信息
 *
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("qingjiajilu")
public class QingjiajiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiajiluEntity() {

	}

	public QingjiajiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 请假学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 请假原因
     */
    @TableField(value = "qingjiajilu_content")

    private String qingjiajiluContent;


    /**
     * 请假天数
     */
    @TableField(value = "qingjiajilu_number")

    private Integer qingjiajiluNumber;


    /**
     * 审批状态
     */
    @TableField(value = "qingjiajilu_types")

    private Integer qingjiajiluTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：请假学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：请假学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：请假原因
	 */
    public String getQingjiajiluContent() {
        return qingjiajiluContent;
    }


    /**
	 * 获取：请假原因
	 */

    public void setQingjiajiluContent(String qingjiajiluContent) {
        this.qingjiajiluContent = qingjiajiluContent;
    }
    /**
	 * 设置：请假天数
	 */
    public Integer getQingjiajiluNumber() {
        return qingjiajiluNumber;
    }


    /**
	 * 获取：请假天数
	 */

    public void setQingjiajiluNumber(Integer qingjiajiluNumber) {
        this.qingjiajiluNumber = qingjiajiluNumber;
    }
    /**
	 * 设置：审批状态
	 */
    public Integer getQingjiajiluTypes() {
        return qingjiajiluTypes;
    }


    /**
	 * 获取：审批状态
	 */

    public void setQingjiajiluTypes(Integer qingjiajiluTypes) {
        this.qingjiajiluTypes = qingjiajiluTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qingjiajilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", qingjiajiluContent=" + qingjiajiluContent +
            ", qingjiajiluNumber=" + qingjiajiluNumber +
            ", qingjiajiluTypes=" + qingjiajiluTypes +
            ", createTime=" + createTime +
        "}";
    }
}
