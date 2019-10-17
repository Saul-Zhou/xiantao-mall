package com.xiantao.entity;


/**首页轮播图类*/
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data 
@NoArgsConstructor
@AllArgsConstructor
public class Carousel {
	//首页轮播图主键id
    private Integer carouselId;
    //轮播图
    private String carouselUrl;
    //点击后的跳转地址(默认不跳转)
    private String redirectUrl;
    //排序值(字段越大越靠前)
    private Integer carouselRank;
    //删除标识字段(0-未删除 1-已删除)
    private Byte isDeleted;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    //创建的用户
    private Integer createUser;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    //更新的用户
    private Integer updateUser;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carouselId=").append(carouselId);
        sb.append(", carouselUrl=").append(carouselUrl);
        sb.append(", redirectUrl=").append(redirectUrl);
        sb.append(", carouselRank=").append(carouselRank);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append("]");
        return sb.toString();
    }
}