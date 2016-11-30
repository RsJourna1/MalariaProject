package com.zxh.ssm.module.login.mapper;

import java.util.List;

import com.zxh.ssm.module.login.pojo.CheckUser;
import com.zxh.ssm.module.login.pojo.CheckUserExample;
import org.apache.ibatis.annotations.Param;

public interface CheckUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int countByExample(CheckUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int deleteByExample(CheckUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String useremail);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int insert(CheckUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int insertSelective(CheckUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    List<CheckUser> selectByExample(CheckUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    CheckUser selectByPrimaryKeyInUser(String useremail);

    CheckUser selectByPrimaryKey(String useremail);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CheckUser record, @Param("example") CheckUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CheckUser record, @Param("example") CheckUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CheckUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CheckUser record);
}