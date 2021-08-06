package cn.edw.demo01;

import cn.edw.api.HelloService;

/**
 * @author Edwin Xu
 * @date 5/14/2021 3:06 PM.
 */

public class HelloServiceImpl implements HelloService {
    public String hello(String name, String msg) {
        System.out.println("Somebody Invokes Me!");
        return "Hello " + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        System.out.println("Somebody Invokes Me!");
        return "Hi " + name + ", " + msg;
    }
}
