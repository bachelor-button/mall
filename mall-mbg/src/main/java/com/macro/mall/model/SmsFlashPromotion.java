package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmsFlashPromotion implements Serializable {
    private Long id;

    @ApiModelProperty(value = "秒杀时间段名称")
    private String title;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "上下线状态")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", title=" + title +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", createTime=" + createTime +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}