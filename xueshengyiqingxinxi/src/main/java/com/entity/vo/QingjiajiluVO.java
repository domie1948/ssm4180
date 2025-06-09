package com.entity.vo;

import com.entity.QingjiajiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 请假信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("qingjiajilu")
public class QingjiajiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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

    @TableField(value = "create_time")
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

}
