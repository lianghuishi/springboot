package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("test")
public class Test {

    @RequestMapping("getName")
    public String getName(){
        return "hahah";
    }

    @RequestMapping("getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("xm",122);
        map.put("xh",2);
        map.put("xy",3);
        map.put("xy",4);
        map.put("xy",5);
        return map;
    }

}
