package com.zxh.ssm.module.analyzeDisease.service.impl;

import com.zxh.ssm.module.analyzeDisease.mapper.AnalyzeMapper;
import com.zxh.ssm.module.analyzeDisease.pojo.AgeGroupAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.service.AnalyzeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
@Service
public class AnalyzeServiceImpl implements AnalyzeService {
    @Resource
    private AnalyzeMapper analyzeMapper;

    @Override
    public Map<String, List<CareerAnalyzeRe>> analyzeByCareer(AnalyzeVo analyzeVo) throws Exception {
        List<CareerAnalyzeRe> careerAnalyzeReList = null;
        Map<String, List<CareerAnalyzeRe>> careerResultMap = new HashMap<>();
        //此处已经去掉“不详”的职业类别数据
        Set<String> diseaseNames = analyzeMapper.selectDisease();
        for (String s : diseaseNames) {
            analyzeVo.setDiseaseName(s);
            careerAnalyzeReList = analyzeMapper.analyzeByCareer(analyzeVo);
            careerResultMap.put(s, careerAnalyzeReList);
        }
        return careerResultMap;
    }

    @Override
    public Map<String, List<SexAnalyzeRe>> analyzeBySex(AnalyzeVo analyzeVo) throws Exception {
        List<SexAnalyzeRe> sexAnalyzeReList = null;
        Map<String, List<SexAnalyzeRe>> sexResultMap = new HashMap<>();
        //此处已经去掉“不详”的职业类别数据
        Set<String> diseaseNames = analyzeMapper.selectDisease();
        for (String s : diseaseNames) {
            analyzeVo.setDiseaseName(s);
            sexAnalyzeReList = analyzeMapper.analyzeBySex(analyzeVo);
            sexResultMap.put(s,sexAnalyzeReList);
        }
        return sexResultMap;
    }

    @Override
    public AgeGroupAnalyzeRe analyzeByAgeGroup(AnalyzeVo analyzeVo) throws Exception {
        List<Integer> ageGroupPop = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            analyzeVo.setVirtualAgeDownLimit(i * 10);
            ageGroupPop.add(i, analyzeMapper.analyzeByAgeGroup(analyzeVo));
        }
        AgeGroupAnalyzeRe ageGroupAnalyzeRe = new AgeGroupAnalyzeRe();
        ageGroupAnalyzeRe.setAgeGroup0_9Pop(ageGroupPop.get(0));
        ageGroupAnalyzeRe.setAgeGroup10_19Pop(ageGroupPop.get(1));
        ageGroupAnalyzeRe.setAgeGroup20_29Pop(ageGroupPop.get(2));
        ageGroupAnalyzeRe.setAgeGroup30_39Pop(ageGroupPop.get(3));
        ageGroupAnalyzeRe.setAgeGroup40_49Pop(ageGroupPop.get(4));
        ageGroupAnalyzeRe.setAgeGroup50_59Pop(ageGroupPop.get(5));
        ageGroupAnalyzeRe.setAgeGroup60_69Pop(ageGroupPop.get(6));
        ageGroupAnalyzeRe.setAgeGroup70_79Pop(ageGroupPop.get(7));
        ageGroupAnalyzeRe.setAgeGroup80_89Pop(ageGroupPop.get(8));
        ageGroupAnalyzeRe.setAgeGroup90_99Pop(ageGroupPop.get(9));
        return ageGroupAnalyzeRe;
    }

}
