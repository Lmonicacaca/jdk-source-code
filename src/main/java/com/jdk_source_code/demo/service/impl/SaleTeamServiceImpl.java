package com.jdk_source_code.demo.service.impl;

import com.jdk_source_code.demo.dao.database2.SaleTeamMapper;
import com.jdk_source_code.demo.domain.SaleTeamDO;
import com.jdk_source_code.demo.service.SaleTeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lilin
 * @date 2019-09-24
 */
@Service
public class SaleTeamServiceImpl implements SaleTeamService {

    @Resource
    private SaleTeamMapper saleTeamMapper;
    @Override
    public SaleTeamDO getSaleTeamInfoById(Integer userId) {
        SaleTeamDO saleTeamDO = new SaleTeamDO();
        saleTeamDO.setUserId(userId);
        return saleTeamMapper.selectOne(saleTeamDO);
    }
}
