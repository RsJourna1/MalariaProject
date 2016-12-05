package com.zxh.ssm.module.analyzeDisease.pojo;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/12/5.
 */
public class CareerChart {
    private String disease;
    private List<String> yearList;
    private List<String> careerList;
    private List<Integer> valuesList;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public List<String> getYearList() {
        return yearList;
    }

    public void setYearList(List<String> yearList) {
        this.yearList = yearList;
    }

    public List<String> getCareerList() {
        return careerList;
    }

    public void setCareerList(List<String> careerList) {
        this.careerList = careerList;
    }

    public List<Integer> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<Integer> valuesList) {
        this.valuesList = valuesList;
    }
}
