package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.whole.pojo.CaseReportInformation;
import com.zxh.ssm.module.upload.pojo.ErrorCaseReportInfor;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/11.
 */
public interface UploadToCaseReportService {
    UploadDBMessage<ErrorCaseReportInfor<String>, CaseReportInformation> saveToCaseReportInfor(String path) throws Exception;
}
