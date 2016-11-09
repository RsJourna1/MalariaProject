package com.zxh.ssm.module.upload.service;

import com.zxh.ssm.module.upload.pojo.ErrorWeatherInfor;
import com.zxh.ssm.module.upload.pojo.UploadDBMessage;
import com.zxh.ssm.module.whole.pojo.WeatherData;

/**
 * Created by 郑晓辉 on 2016/10/12.
 */
public interface UploadToWeatherService {
    UploadDBMessage<ErrorWeatherInfor<String>, WeatherData> saveDataToWeather(String path) throws Exception;
}
