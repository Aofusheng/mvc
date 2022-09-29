package test;


import com.ao.pojo.Province;
import com.ao.service.ProvinceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//启动spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml", "classpath:applicationContext_service.xml"})
public class MyTest {
    @Autowired
    ProvinceService provinceService;

    @Test
    public void testSelect(){
        List<Province> lists = provinceService.selectProvincePage(null,null,null,3);
        lists.forEach(list-> System.out.println(list));
    }
}
