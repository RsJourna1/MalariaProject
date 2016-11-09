package com.zxh.ssm.module.analyzeDisease.service.impl;

import com.zxh.ssm.module.analyzeDisease.mapper.DynamicOutbreakMapper;
import com.zxh.ssm.module.analyzeDisease.pojo.DynamicOutbreakRe;
import com.zxh.ssm.module.analyzeDisease.pojo.DynamicOutbreakVo;
import com.zxh.ssm.module.analyzeDisease.service.DynamicOutbreakService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 郑晓辉 on 2016/10/1.
 */
@Service
public class DynamicOutbreakServiceImpl implements DynamicOutbreakService{
    @Resource
    private DynamicOutbreakMapper dynamicOutbreakMapper;
    @Override
    public List<DynamicOutbreakRe> findAddressList(DynamicOutbreakVo dynamicOutbreakVo) throws Exception {
        return dynamicOutbreakMapper.selectAddressByYearMonth(dynamicOutbreakVo);
    }
}
