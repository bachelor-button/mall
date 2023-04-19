package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UmsRoleMenuRelation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @ApiModelProperty(value = "菜单ID")
    private Long menuId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}