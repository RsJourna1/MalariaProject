package com.zxh.ssm.module.whole.mapper;

import com.zxh.ssm.module.whole.pojo.Indicator;
import com.zxh.ssm.module.whole.pojo.IndicatorExample;
import com.zxh.ssm.module.whole.pojo.IndicatorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndicatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int countByExample(IndicatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int deleteByExample(IndicatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(IndicatorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int insert(Indicator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int insertSelective(Indicator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    List<Indicator> selectByExample(IndicatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    Indicator selectByPrimaryKey(IndicatorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Indicator record, @Param("example") IndicatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Indicator record, @Param("example") IndicatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Indicator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indicator
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Indicator record);
}