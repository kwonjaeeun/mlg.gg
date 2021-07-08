package com.gg.mlg.mlg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping("/home")
    public String tilesTest(){
        return "temp/hello";
    }

    @GetMapping("/chat")
    public String chatTest() { return "temp/chat"; }
}
