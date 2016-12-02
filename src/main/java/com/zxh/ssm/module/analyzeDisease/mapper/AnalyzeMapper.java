package com.zxh.ssm.module.analyzeDisease.mapper;

import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;

import java.util.List;
import java.util.Set;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
public interface AnalyzeMapper {

    List<SexAnalyzeRe> analyzeBySex(String dataSource)throws Exception;

    Set<String> selectDisease()throws Exception;

    List<CareerAnalyzeRe> analyzeByCareer(AnalyzeVo analyzeVo)throws Exception;

    int analyzeByAgeGroup(AnalyzeVo analyzeVo)throws Exception;
}
