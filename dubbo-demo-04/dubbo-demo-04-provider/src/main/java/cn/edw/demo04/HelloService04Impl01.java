package cn.edw.demo04;

import cn.edw.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Edwin Xu
 * @date 5/19/2021 3:00 PM.
 *
 * timeout：服务提供方，接口级别
 */
@DubboService(timeout = 2000)
public class HelloService04Impl01 implements HelloService {
    public String hello(String name, String msg) {
        // 睡眠一下，测试一下timeout
        try {
            Thread.sleep(1700);
        }catch (Exception e){

        }
        return "From Provider-01: hello" + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        return "From Provider-01: hi" + name + ", " + msg;
    }
}
