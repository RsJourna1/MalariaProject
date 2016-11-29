package com.zxh.ssm.module.analyzeDisease.controller;

import com.zxh.ssm.module.analyzeDisease.pojo.AgeGroupAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.AnalyzeVo;
import com.zxh.ssm.module.analyzeDisease.pojo.CareerAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.pojo.SexAnalyzeRe;
import com.zxh.ssm.module.analyzeDisease.service.AnalyzeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 根据疾病进行分类
 * 展示疾病人群的性别、职业、年龄段的关系
 * Created by 郑晓辉 on 2016/10/3.
 */
@Controller
@RequestMapping("/AnalyzeController")
public class AnalyzeController {
    @Resource
    private AnalyzeService analyzeService;

    @RequestMapping("analyzeView")
    public String analyzeView()throws  Exception{
        return "common/charts";
    }

    @RequestMapping("/careerModule")
    public
    @ResponseBody
    Map<String, List<CareerAnalyzeRe>> careerModule(AnalyzeVo analyzeVo) throws Exception {
        System.out.println(analyzeService.analyzeByCareer(analyzeVo));
        return analyzeService.analyzeByCareer(analyzeVo);
    }

    @RequestMapping("/sexModule")
    public
    @ResponseBody
    Map<String, List<SexAnalyzeRe>> sexModule(AnalyzeVo analyzeVo) throws Exception {
        return analyzeService.analyzeBySex(analyzeVo);
    }

    @RequestMapping("/ageGroupModule")
    public
    @ResponseBody
    AgeGroupAnalyzeRe ageGroupModule(AnalyzeVo analyzeVo) throws Exception {
        return analyzeService.analyzeByAgeGroup(analyzeVo);
    }
}
