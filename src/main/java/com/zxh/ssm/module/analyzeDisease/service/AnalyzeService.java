package com.zxh.ssm.module.analyzeDisease.service;

import com.zxh.ssm.module.analyzeDisease.pojo.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
public interface AnalyzeService {
    List<SexChart> analyzeBySex(String dataSource) throws Exception;

    List<CareerChart> analyzeByCareer(String dataSource) throws Exception;

    AgeGroupAnalyzeRe analyzeByAgeGroup(AnalyzeVo analyzeVo) throws Exception;
}
