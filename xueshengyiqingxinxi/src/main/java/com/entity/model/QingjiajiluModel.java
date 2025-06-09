package com.entity.model;

import com.entity.QingjiajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 请假信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-06
 */
public class QingjiajiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 请假学生
     */
    private Integer yonghuId;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假原因
     */
    private String qingjiajiluContent;


    /**
     * 请假天数
     */
    private Integer qingjiajiluNumber;


    /**
     * 审批状态
     */
    private Integer qingjiajiluTypes;


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
	 * 获取：请假学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：请假学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假原因
	 */
    public String getQingjiajiluContent() {
        return qingjiajiluContent;
    }


    /**
	 * 设置：请假原因
	 */
    public void setQingjiajiluContent(String qingjiajiluContent) {
        this.qingjiajiluContent = qingjiajiluContent;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getQingjiajiluNumber() {
        return qingjiajiluNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setQingjiajiluNumber(Integer qingjiajiluNumber) {
        this.qingjiajiluNumber = qingjiajiluNumber;
    }
    /**
	 * 获取：审批状态
	 */
    public Integer getQingjiajiluTypes() {
        return qingjiajiluTypes;
    }


    /**
	 * 设置：审批状态
	 */
    public void setQingjiajiluTypes(Integer qingjiajiluTypes) {
        this.qingjiajiluTypes = qingjiajiluTypes;
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
