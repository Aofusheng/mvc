package com.ao.service.impl;

import com.ao.mapper.ProvinceMapper;
import com.ao.pojo.Province;
import com.ao.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceMapper provinceMapper;

    @Override
    public List<Province> selectProvincePage(String name, String jiancheng, String shenghui, int start) {
        return provinceMapper.selectProvincePage(name, jiancheng, shenghui, start);
    }
}
