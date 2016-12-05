package com.zxh.ssm.module.login.service;


import com.zxh.ssm.module.whole.pojo.User;

import java.util.List;

/**
 * Created by R丶sJournal on 2016/11/6.
 */
public interface UserService {
    User checkLogin(String userEmail, String password) throws Exception;

    boolean checkRegister(String userEmail) throws Exception;

    void saveRegister(User User) throws Exception;

    List<User> selectCheckUser() throws Exception;

    void updateUser(String userEmail) throws Exception;
}
