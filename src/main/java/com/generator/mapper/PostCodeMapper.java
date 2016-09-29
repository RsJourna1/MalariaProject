package com.generator.mapper;

import com.generator.pojo.PostCode;
import com.generator.pojo.PostCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int countByExample(PostCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int deleteByExample(PostCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer postalcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int insert(PostCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int insertSelective(PostCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    List<PostCode> selectByExample(PostCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    PostCode selectByPrimaryKey(Integer postalcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PostCode record, @Param("example") PostCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PostCode record, @Param("example") PostCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PostCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post_code
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PostCode record);
}