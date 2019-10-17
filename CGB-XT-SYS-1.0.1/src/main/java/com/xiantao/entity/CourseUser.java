package com.xiantao.entity;
/**我不知道这个类是干什么的，但我不敢删*/
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseUser {
    private Long userId;

    private String userPhone;

    private String pwdMd5;

    private String loginOnlyCode;

    private Byte locked;

    private String userFrom;

    private String remark;

    private Byte userType;

    private String userEmail;

    private String userName;

    private String avatar;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String ip1;

    private String ip2;

    private String ip3;

    private String ip4;

    private Integer pwdCount;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", pwdMd5=").append(pwdMd5);
        sb.append(", loginOnlyCode=").append(loginOnlyCode);
        sb.append(", locked=").append(locked);
        sb.append(", userFrom=").append(userFrom);
        sb.append(", remark=").append(remark);
        sb.append(", userType=").append(userType);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userName=").append(userName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ip1=").append(ip1);
        sb.append(", ip2=").append(ip2);
        sb.append(", ip3=").append(ip3);
        sb.append(", ip4=").append(ip4);
        sb.append(", pwdCount=").append(pwdCount);
        sb.append("]");
        return sb.toString();
    }
}