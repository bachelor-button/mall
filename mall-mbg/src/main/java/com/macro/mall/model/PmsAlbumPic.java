package com.macro.mall.model;

import java.io.Serializable;

public class PmsAlbumPic implements Serializable {
    private Long id;

    private Long albumId;

    private String pic;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", albumId=" + albumId +
                ", pic=" + pic +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}