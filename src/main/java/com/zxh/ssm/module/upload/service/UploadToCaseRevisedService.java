package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.whole.pojo.CaseRevisedInformation;
import com.zxh.ssm.module.upload.pojo.ErrorCaseRevisedInfor;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/11.
 */
public interface UploadToCaseRevisedService {
    UploadDBMessage<ErrorCaseRevisedInfor<String>, CaseRevisedInformation> saveToCaseRevisedInfor(String path) throws Exception;
}
