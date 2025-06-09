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
 * 体温汇报
 *
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("tiwenhuibao")
public class TiwenhuibaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TiwenhuibaoEntity() {

	}

	public TiwenhuibaoEntity(T t) {
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
     * 汇报学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 测量时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 体温
     */
    @TableField(value = "tiwenhuibao_tiwen")

    private Double tiwenhuibaoTiwen;


    /**
     * 是否不适
     */
    @TableField(value = "shifou_types")

    private Integer shifouTypes;


    /**
     * 体温状态
     */
    @TableField(value = "tiwen_types")

    private Integer tiwenTypes;


    /**
     * 详情信息
     */
    @TableField(value = "tiwenhuibao_content")

    private String tiwenhuibaoContent;


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
	 * 设置：汇报学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：汇报学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：测量时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：测量时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：体温
	 */
    public Double getTiwenhuibaoTiwen() {
        return tiwenhuibaoTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setTiwenhuibaoTiwen(Double tiwenhuibaoTiwen) {
        this.tiwenhuibaoTiwen = tiwenhuibaoTiwen;
    }
    /**
	 * 设置：是否不适
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 获取：是否不适
	 */

    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
    }
    /**
	 * 设置：体温状态
	 */
    public Integer getTiwenTypes() {
        return tiwenTypes;
    }


    /**
	 * 获取：体温状态
	 */

    public void setTiwenTypes(Integer tiwenTypes) {
        this.tiwenTypes = tiwenTypes;
    }
    /**
	 * 设置：详情信息
	 */
    public String getTiwenhuibaoContent() {
        return tiwenhuibaoContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setTiwenhuibaoContent(String tiwenhuibaoContent) {
        this.tiwenhuibaoContent = tiwenhuibaoContent;
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
        return "Tiwenhuibao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", tiwenhuibaoTiwen=" + tiwenhuibaoTiwen +
            ", shifouTypes=" + shifouTypes +
            ", tiwenTypes=" + tiwenTypes +
            ", tiwenhuibaoContent=" + tiwenhuibaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
