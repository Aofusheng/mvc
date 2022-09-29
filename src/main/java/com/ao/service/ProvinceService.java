package com.ao.service;

import com.ao.pojo.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceService {

    List<Province> selectProvincePage(String name, String jiancheng, String shenghui, int start);
}
