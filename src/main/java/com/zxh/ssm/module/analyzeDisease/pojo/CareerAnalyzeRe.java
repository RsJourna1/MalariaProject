package com.zxh.ssm.module.analyzeDisease.pojo;

/**
 * Created by 郑晓辉 on 2016/10/3.
 */
public class CareerAnalyzeRe {
    private int year;
    private String disease;
    private String career;
    private int patientNum;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(int patientNum) {
        this.patientNum = patientNum;
    }
}
