package com.zxh.ssm.module.login.controller;


import com.zxh.ssm.module.whole.pojo.User;
import com.zxh.ssm.module.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by R丶sJournal on 2016/11/6.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView userLogin(User user) throws Exception {
        User userChecked = userService.checkLogin(user.getUseremail(), user.getUserpassword());
        ModelAndView modelAndView = new ModelAndView();
        if (null != userChecked) {
            modelAndView.addObject("user", user);
            //系统管理员页面
            if (userChecked.getPerissioninformation().equals("3")) {
                modelAndView.setViewName("common/systemAdminUI");
            }
            //管理员
            if (userChecked.getPerissioninformation().equals("2")) {
                modelAndView.setViewName("common/AdminUI");
            }
            return modelAndView;
        } else {
            modelAndView.setViewName("error/404");
            return modelAndView;
        }
    }

    @RequestMapping("/register")
    public ModelAndView userRegister(User user) throws Exception {
        boolean registerType = userService.checkRegister(user.getUseremail());
        ModelAndView modelAndView = new ModelAndView();
        if (registerType) {
            userService.saveRegister(user);
            modelAndView.setViewName("../../login");
        }
        return modelAndView;
    }

    @RequestMapping("/showCheckUser")
    public ModelAndView showCheckUser() throws Exception {
        List<User> User = userService.selectCheckUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("checkUser", User);
        modelAndView.setViewName("common/checkUser");
        return modelAndView;
    }

    @RequestMapping("/checkUserAgree")
    public ModelAndView checkUserAgree() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

}
