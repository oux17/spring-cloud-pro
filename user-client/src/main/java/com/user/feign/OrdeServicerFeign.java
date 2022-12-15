package com.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Component
@FeignClient(value = "orderclient")
public interface OrdeServicerFeign {

    @RequestMapping(value = "/order/add", method = RequestMethod.POST)
    public String add(HashMap<String,String> map);

}
