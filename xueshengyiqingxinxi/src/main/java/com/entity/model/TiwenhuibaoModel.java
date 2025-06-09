package com.entity.model;

import com.entity.TiwenhuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 体温汇报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-06
 */
public class TiwenhuibaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 汇报学生
     */
    private Integer yonghuId;


    /**
     * 测量时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 体温
     */
    private Double tiwenhuibaoTiwen;


    /**
     * 是否不适
     */
    private Integer shifouTypes;


    /**
     * 体温状态
     */
    private Integer tiwenTypes;


    /**
     * 详情信息
     */
    private String tiwenhuibaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：汇报学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：汇报学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：测量时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：测量时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：体温
	 */
    public Double getTiwenhuibaoTiwen() {
        return tiwenhuibaoTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setTiwenhuibaoTiwen(Double tiwenhuibaoTiwen) {
        this.tiwenhuibaoTiwen = tiwenhuibaoTiwen;
    }
    /**
	 * 获取：是否不适
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 设置：是否不适
	 */
    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
    }
    /**
	 * 获取：体温状态
	 */
    public Integer getTiwenTypes() {
        return tiwenTypes;
    }


    /**
	 * 设置：体温状态
	 */
    public void setTiwenTypes(Integer tiwenTypes) {
        this.tiwenTypes = tiwenTypes;
    }
    /**
	 * 获取：详情信息
	 */
    public String getTiwenhuibaoContent() {
        return tiwenhuibaoContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setTiwenhuibaoContent(String tiwenhuibaoContent) {
        this.tiwenhuibaoContent = tiwenhuibaoContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
