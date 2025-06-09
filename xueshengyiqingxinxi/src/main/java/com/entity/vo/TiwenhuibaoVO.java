package com.entity.vo;

import com.entity.TiwenhuibaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 体温汇报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("tiwenhuibao")
public class TiwenhuibaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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

}
