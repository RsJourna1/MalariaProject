package com.zxh.ssm.module.analyzeDisease.service;

import com.zxh.ssm.module.analyzeDisease.pojo.AgeGroupAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;

import java.util.List;
import java.util.Map;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
public interface AnalyzeService {
    Map<String, List<CareerAnalyzeRe>> analyzeByCareer(AnalyzeVo analyzeVo) throws Exception;

    Map<String, List<SexAnalyzeRe>> analyzeBySex(AnalyzeVo analyzeVo) throws Exception;

    AgeGroupAnalyzeRe analyzeByAgeGroup(AnalyzeVo analyzeVo) throws Exception;
}
