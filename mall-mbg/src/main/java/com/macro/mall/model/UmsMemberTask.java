package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    @ApiModelProperty(value = "赠送成长值")
    private Integer growth;

    @ApiModelProperty(value = "赠送积分")
    private Integer intergration;

    @ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务")
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getIntergration() {
        return intergration;
    }

    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", name=" + name +
                ", growth=" + growth +
                ", intergration=" + intergration +
                ", type=" + type +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}