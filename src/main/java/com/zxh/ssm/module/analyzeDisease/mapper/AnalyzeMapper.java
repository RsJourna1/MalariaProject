package com.zxh.ssm.module.analyzeDisease.mapper;

import com.zxh.ssm.module.analyzeDisease.pojo.AgeGroupAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;

import java.util.List;
import java.util.Set;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
public interface AnalyzeMapper {

    Set<String> selectDisease()throws Exception;

    List<SexAnalyzeRe> analyzeBySex(String dataSource)throws Exception;

    List<CareerAnalyzeRe> analyzeByCareer(String dataSource)throws Exception;

    List<AgeGroupAnalyzeRe> analyzeByAgeGroup(String dataSource)throws Exception;
}
