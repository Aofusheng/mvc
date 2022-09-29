package com.ao.controller;


import com.ao.pojo.Province;
import com.ao.service.ProvinceService;
import com.sun.rowset.internal.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@CrossOrigin/*服务器端支持跨域访问*/
@Controller/*全为ajax请求时 @RestController 方法上的ResponseBody注解可不写 */
public class ProvinceController {

    public static final int PAGE_SIZE = 5;

    @Autowired
    ProvinceService provinceService;
    @RequestMapping("/getList")
    @ResponseBody
    public List<Province> selectProvincePage(String name, String jiancheng, String shenghui, Integer startPage){
        int startRow = 0;
        if (startPage != null){
            startRow = (startPage - 1) * PAGE_SIZE;
        }
        return provinceService.selectProvincePage(name,jiancheng,shenghui,startRow);
    }
}
