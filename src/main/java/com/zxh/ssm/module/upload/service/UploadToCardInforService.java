package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.whole.pojo.CardInformation;
import com.zxh.ssm.module.upload.pojo.ErrorCardInfor;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/11.
 */
public interface UploadToCardInforService {
    UploadDBMessage<ErrorCardInfor<String>, CardInformation> saveDataToCardInfor(String path) throws Exception;
}
