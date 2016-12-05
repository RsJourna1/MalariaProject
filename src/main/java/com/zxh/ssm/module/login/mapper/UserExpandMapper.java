package com.zxh.ssm.module.login.mapper;

import com.zxh.ssm.module.whole.pojo.User;

import java.util.List;

/**
 * Created by R丶sJournal on 2016/12/5.
 */
public interface UserExpandMapper {
    List<User> selectCheckUser();

    User selectByPrimaryKeyInUser(String useremail);

    void updateCheckUser(String useremail);

}
