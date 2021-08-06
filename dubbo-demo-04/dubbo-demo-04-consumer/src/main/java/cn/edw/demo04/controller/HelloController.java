package cn.edw.demo04.controller;

import cn.edw.demo04.service.MyHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Edwin Xu
 * @date 5/19/2021 7:18 PM.
 */
@Controller
@ResponseBody
public class HelloController {
    @Autowired
    private MyHelloService myHelloService;

    @GetMapping(value = "/hello")
    public String hello() {
        return myHelloService.sayHello();
    }

    @GetMapping(value = "/hi")
    public String hi() {
        return myHelloService.sayHi();
    }


}
