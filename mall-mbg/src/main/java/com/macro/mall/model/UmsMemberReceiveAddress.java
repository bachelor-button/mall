package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsMemberReceiveAddress implements Serializable {
    private Long id;

    private Long memberId;

    @ApiModelProperty(value = "收货人名称")
    private String name;

    private String phoneNumber;

    @ApiModelProperty(value = "是否为默认")
    private Integer defaultStatus;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "省份/直辖市")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String region;

    @ApiModelProperty(value = "详细地址(街道)")
    private String detailAddress;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", memberId=" + memberId +
                ", name=" + name +
                ", phoneNumber=" + phoneNumber +
                ", defaultStatus=" + defaultStatus +
                ", postCode=" + postCode +
                ", province=" + province +
                ", city=" + city +
                ", region=" + region +
                ", detailAddress=" + detailAddress +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}