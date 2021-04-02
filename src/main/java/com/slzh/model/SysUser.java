package com.slzh.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class SysUser {
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
