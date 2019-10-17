package com.xiantao.entity;

import lombok.Data;

@Data
public class AdminUser {
	private int adminUserId;//id
	//登陆的用户名
	private String loginUserName;
	//登录密码
	private Integer loginPassword;
	//用户名称
	private String nickName;
	//lock用于表示用户权限，0表示为受限制，1表示受限制
	private int locked=1;//默认为1
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminUserId=").append(adminUserId);
        sb.append(", loginUserName=").append(loginUserName);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", nickName=").append(nickName);
        sb.append(", locked=").append(locked);
        sb.append("]");
        return sb.toString();
    }
}
