package cn.edw.demo04;

import cn.edw.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Edwin Xu
 * @date 5/19/2021 7:36 PM.
 */
@DubboService
public class HelloService04Impl02 implements HelloService {
    public String hello(String name, String msg) {

        try {
            Thread.sleep(1500);
        }catch (Exception e){

        }
        return "From Provider-02: hello" + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        return "From Provider-02: hi" + name + ", " + msg;
    }
}
