package com.zxh.ssm.module.user.mapper;

import com.zxh.ssm.module.analyzeDisease.mapper.AnalyzeMapper;
import com.zxh.ssm.module.analyzeDisease.pojo.AgeGroupAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.*;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class AnalyzeMapperTest {

    @Resource
    private AnalyzeMapper analyzeMapper;

    @Test
    public void selectDisease() throws Exception {
        for (String s : analyzeMapper.selectDisease()
                ) {
            System.out.println(s);
        }
    }

    @Test
    public void analyzeBySex() throws Exception {
        String dataSource = "";
        List<SexAnalyzeRe> result = analyzeMapper.analyzeBySex(dataSource);
        for (int i = 0; i < 10; i++) {
            System.out.println(result.get(i).getDisease() +
                    "||" + result.get(i).getYear()
                    + "||" + result.get(i).getSex()
                    + "||" + result.get(i).getPatientNum());
        }
//        AnalyzeVo analyzeVo = new AnalyzeVo();
//        analyzeVo.setBeginYear(2005);
////        analyzeVo.setEndYear(2011);
//        analyzeVo.setProvince("福建");
//        List<SexAnalyzeRe> sexAnalyzeReList = null;
//        Map<String, List<SexAnalyzeRe>> sexResultMap = new HashMap<>();
//        //此处已经去掉“不详”的职业类别数据
//        Set<String> diseaseNames = analyzeMapper.selectDisease();
//        for (String s : diseaseNames) {
//            analyzeVo.setDiseaseName(s);
//            sexAnalyzeReList = analyzeMapper.analyzeBySex(analyzeVo);
//            sexResultMap.put(s,sexAnalyzeReList);
//        }
//        System.out.println(sexResultMap.get("恶性疟"));
//        System.out.println("===Over===");
    }

    @Test
    public void analyzeByCareer() throws Exception {
        String dataSource = "杭州";
        System.out.println(analyzeMapper.analyzeByCareer(dataSource).get(0).getDisease());
//        AnalyzeVo analyzeVo = new AnalyzeVo();
//        analyzeVo.setBeginYear(2005);
////        analyzeVo.setEndYear(2011);
//        analyzeVo.setProvince("云南");
//        List<CareerAnalyzeRe> careerAnalyzeReList = null;
//        Map<String, List<CareerAnalyzeRe>> careerResultMap = new HashMap<>();
//        //此处已经去掉“不详”的职业类别数据
//        Set<String> diseaseNames = analyzeMapper.selectDisease();
//        for (String s : diseaseNames) {
//            analyzeVo.setDiseaseName(s);
//            careerAnalyzeReList = analyzeMapper.analyzeByCareer(analyzeVo);
//            careerResultMap.put(s, careerAnalyzeReList);
//        }
//        System.out.println(careerResultMap.get("恶性疟"));
//        System.out.println("===Over===");
    }

    @Test
    public void analyzeByAgeGroup() throws Exception {
        String dataSource = "北京";
        System.out.println(analyzeMapper.analyzeByAgeGroup(dataSource).get(0).getAgeGroup());
    }

}