package com.ao.mapper;

import com.ao.pojo.Province;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvinceMapper {

    List<Province> selectProvincePage(
            @Param("name")
            String name,
            @Param("jiancheng")
            String jiancheng,
            @Param("shenghui")
            String shenghui,
            @Param("start")
            int start
    );


}
