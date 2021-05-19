package cn.edw.demo04;

import cn.edw.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Edwin Xu
 * @date 5/19/2021 3:00 PM.
 */

@DubboService
public class HelloService04Impl01 implements HelloService {
    public String hello(String name, String msg) {
        return "From Provider-01: hello" + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        return "From Provider-01: hi" + name + ", " + msg;
    }
}
