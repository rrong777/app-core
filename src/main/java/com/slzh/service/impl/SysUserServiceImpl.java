package com.slzh.service.impl;

import com.slzh.dao.SysUserMapper;
import com.slzh.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public String getUsernameById(int i) {
        return sysUserMapper.getUsernameById(i);
    }
}
