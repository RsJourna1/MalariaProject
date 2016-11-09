package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.upload.pojo.ErrorObserStaInfor;
import com.zxh.ssm.module.whole.pojo.MeteorologicalStationInsformation;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;

/**
 * Created by 郑晓辉 on 2016/10/12.
 */
public interface UploadToObserStaService {
    UploadDBMessage<ErrorObserStaInfor<String>, MeteorologicalStationInsformation> saveDataToObserSta(String path) throws Exception;
}
