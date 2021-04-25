package com.slzh.web.controller;

import com.slzh.model.SysUser;
import com.slzh.model.http.HttpResult;
import com.slzh.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @GetMapping
    public String user() {
        return sysUserService.getUsernameById(1);
    }

    @PostMapping
    public HttpResult user(@RequestBody @Valid SysUser sysUser, BindingResult errors) {
        return null;
    }
}
