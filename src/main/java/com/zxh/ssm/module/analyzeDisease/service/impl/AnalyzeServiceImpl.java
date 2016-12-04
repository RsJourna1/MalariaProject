package com.zxh.ssm.module.analyzeDisease.service.impl;

import com.zxh.ssm.module.analyzeDisease.mapper.AnalyzeMapper;
import com.zxh.ssm.module.analyzeDisease.pojo.*;
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
    public List<SexChart> analyzeBySex(String dataSource) throws Exception {
        List<SexAnalyzeRe> sexAnalyzeReList = analyzeMapper.analyzeBySex(dataSource);
        if (0 == sexAnalyzeReList.size()) {
            return null;
        }
        List<SexAnalyzeRe> diseaseC1 = new ArrayList<>();
        List<String> yearListC1 = new ArrayList<>();
        List<SexAnalyzeRe> diseaseC2 = new ArrayList<>();
        List<String> yearListC2 = new ArrayList<>();
        for (int count = 0; count < sexAnalyzeReList.size(); count++) {
            SexAnalyzeRe current = sexAnalyzeReList.get(count);
            if (current.getDisease().equals("恶性疟")) {
                diseaseC1.add(current);
                if (!yearListC1.contains(Integer.toString(current.getYear()))) {
                    yearListC1.add(Integer.toString(current.getYear()));
                }
            } else if (current.getDisease().equals("间日疟")) {
                diseaseC2.add(current);
                if (!yearListC2.contains(Integer.toString(current.getYear()))) {
                    yearListC2.add(Integer.toString(current.getYear()));
                }
            }
        }
        List<String> sexList = new ArrayList<>();
        sexList.add("男");
        sexList.add("女");

        List<Integer> valueListC1 = new ArrayList<>();
        for (int i = 0; i < yearListC1.size(); i++) {
            valueListC1.add(i * sexList.size(), 0);
            valueListC1.add(i * sexList.size() + 1, 0);
            for (int j = 0; j < diseaseC1.size(); j++) {
                SexAnalyzeRe current = diseaseC1.get(j);
                if (yearListC1.get(i).equals(Integer.toString(current.getYear()))) {
                    if (current.getSex().equals(sexList.get(0))) {
                        valueListC1.set(i * sexList.size(), current.getPatientNum());
                    }
                    if (current.getSex().equals(sexList.get(1))) {
                        valueListC1.set(i * sexList.size() + 1, current.getPatientNum());
                    }
                }
            }
        }
        SexChart sexChartC1 = new SexChart();
        sexChartC1.setDisease("恶性疟");
        sexChartC1.setSexList(sexList);
        sexChartC1.setYearList(yearListC1);
        sexChartC1.setValuesList(valueListC1);

        List<Integer> valueListC2 = new ArrayList<>();
        for (int i = 0; i < yearListC2.size(); i++) {
            valueListC2.add(i * sexList.size(), 0);
            valueListC2.add(i * sexList.size() + 1, 0);
            for (int j = 0; j < diseaseC2.size(); j++) {
                SexAnalyzeRe current = diseaseC2.get(j);
                if (yearListC2.get(i).equals(Integer.toString(current.getYear()))) {
                    if (current.getSex().equals(sexList.get(0))) {
                        valueListC2.set(i * sexList.size(), current.getPatientNum());
                        continue;
                    }
                    if (current.getSex().equals(sexList.get(1))) {
                        valueListC2.set(i * sexList.size() + 1, current.getPatientNum());
                    }
                }
            }
        }
        SexChart sexChartC2 = new SexChart();
        sexChartC2.setDisease("间日疟");
        sexChartC2.setSexList(sexList);
        sexChartC2.setYearList(yearListC2);
        sexChartC2.setValuesList(valueListC2);

        List<SexChart> sexChartList = new ArrayList<>();
        sexChartList.add(0, sexChartC1);
        sexChartList.add(1, sexChartC2);
        return sexChartList;
    }

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
//        List<Map<SexViewKey,Integer>> sexChartData = new ArrayList<>();
//        SexViewKey sexViewKey = null;
//        SexAnalyzeRe current = null;
//        Map<SexViewKey,Integer> sexViewKeyMap = null;
//        for (int index = 0; index < sexAnalyzeReList.size(); index++) {
//            sexViewKey = new SexViewKey();
//            current = sexAnalyzeReList.get(index);
//            sexViewKeyMap= new HashMap<>();
//            sexViewKey.setDisease(current.getDisease());
//            sexViewKey.setDataYear(Integer.toBinaryString(current.getYear()));
//            sexViewKey.setSex(current.getSex());
//            sexViewKeyMap.put(sexViewKey,current.getPatientNum());
//            sexChartData.add(index,sexViewKeyMap);
//        }
//        return sexChartData;