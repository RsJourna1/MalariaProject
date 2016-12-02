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
        Set<Integer> year1 = new HashSet<>();
        List<String> sex1 = new ArrayList<>();
        List<Integer> nums1 = new ArrayList<>();
        Set<Integer> year2 = new HashSet<>();
        List<String> sex2 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        for (int index = 0; index < sexAnalyzeReList.size(); index++) {
            SexAnalyzeRe current = sexAnalyzeReList.get(index);
            if (current.getDisease().equals("恶性疟")) {
                year1.add(current.getYear());
                if (!sex1.contains(current.getSex())){
                    sex1.add(current.getSex());
                }
                nums1.add(current.getPatientNum());
                continue;
            } else if (current.getDisease().equals("间日疟")) {
                year2.add(current.getYear());
                if (!sex2.contains(current.getSex())){
                    sex2.add(current.getSex());
                }
                nums2.add(current.getPatientNum());
            }
        }
        Iterator<Integer> ite = year1.iterator();
        List<String> year1List = new ArrayList<>();
        while(ite.hasNext()){
            year1List.add(ite.next().toString());
        }
        List<SexChart> sexChartList = new ArrayList<>();
        SexChart sexChart1 = new SexChart();
        sexChart1.setDisease("恶性疟");
        sexChart1.setYearList(year1List);
        sexChart1.setSexList(sex1);
        sexChart1.setValuesList(nums1);
        sexChartList.add(sexChart1);
        Iterator<Integer> ite2 = year2.iterator();
        List<String> year2List = new ArrayList<>();
        while(ite2.hasNext()){
            year2List.add(ite2.next().toString());
        }
        SexChart sexChart2 = new SexChart();
        sexChart2.setDisease("间日疟");
        sexChart2.setYearList(year2List);
        sexChart2.setSexList(sex2);
        sexChart2.setValuesList(nums2);
        sexChartList.add(sexChart2);
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