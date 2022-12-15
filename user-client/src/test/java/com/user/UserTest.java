package com.user;

import com.user.dto.UserInfoDTO;
import com.user.feign.OrdeServicerFeign;
import com.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserService userService;
    @Autowired
    OrdeServicerFeign ordeServicerFeign;

    @Test
    public void test1(){
        List<UserInfoDTO> list = userService.searchAll();
        System.out.println(list);
    }

    @Test
    public void teste2(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("orderName","丽萨3");
        map.put("orderType","分3");


        String str = ordeServicerFeign.add(map);

        System.out.println("str="+str);

    }
}
