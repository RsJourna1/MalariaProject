package com.zxh.ssm.module.user.service.impl;

import com.zxh.ssm.module.user.pojo.UserLogin;
import com.zxh.ssm.module.whole.mapper.UserDetailsMapper;
import com.zxh.ssm.module.whole.pojo.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 郑晓辉 on 2016/11/28.
 */
@Service
public class UserServiceImpl {
    @Resource
    private UserDetailsMapper userDetailsMapper;

    public String confirmUser(UserLogin userLogin) throws Exception {
        UserDetails userDetails = userDetailsMapper.selectByPrimaryKey(userLogin.getUserName());
        if (null == userDetails) {
            return "notAllowed";
        } else {
            if (userLogin.getPassword().equals(userDetails.getPassword())) {
                return "ok";
            }
            return "passwordError";
        }
    }
}
