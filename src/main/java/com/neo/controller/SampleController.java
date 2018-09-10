package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping("hello")
    public String getListaUtentiView(ModelMap map){
        map.put("name", "测试中");
        return "myJsp";
    }


}
