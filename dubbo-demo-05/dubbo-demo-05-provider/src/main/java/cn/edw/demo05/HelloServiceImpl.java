package cn.edw.demo05;

import cn.edw.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Edwin Xu
 * @date 5/22/2021 10:24 PM.
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    public String hello(String name, String msg) {
        return "hello, " + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        return "hi, " + name + ", " + msg;
    }
}
