package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.whole.pojo.CaseJudgmentInformation;
import com.zxh.ssm.module.upload.pojo.ErrorCaseJudgInfor;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/11.
 */
public interface UploadToCaseJudgService {
    UploadDBMessage<ErrorCaseJudgInfor<String>, CaseJudgmentInformation> saveToCaseJudgInfor(String path) throws Exception;
}
