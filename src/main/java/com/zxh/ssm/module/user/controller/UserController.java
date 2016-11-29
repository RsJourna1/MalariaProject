package com.zxh.ssm.module.user.controller;

import com.zxh.ssm.module.user.pojo.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 郑晓辉 on 2016/11/28.
 */
@RequestMapping("/user")
@Controller
public class UserController {

//    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(UserLogin userLogin)throws Exception{
        return "common/AdminUI";
    }
}
