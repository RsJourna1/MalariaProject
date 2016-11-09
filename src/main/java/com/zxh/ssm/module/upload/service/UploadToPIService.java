package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.upload.pojo.ErrorPatientInformation;
import com.zxh.ssm.module.whole.pojo.PatientInformation;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/4.
 */
public interface UploadToPIService {
     UploadDBMessage<ErrorPatientInformation<String>, PatientInformation> saveDataToPatientInformation(String path) throws Exception;

}
