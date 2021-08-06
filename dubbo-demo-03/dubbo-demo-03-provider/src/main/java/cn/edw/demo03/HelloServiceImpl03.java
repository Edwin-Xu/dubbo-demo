package cn.edw.demo03;

import cn.edw.api.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Edwin Xu
 * @date 5/14/2021 7:23 PM.
 *
 * \@Service是Dubbo提供的注解，将一个类声明为一个服务提供者
 */

@Service
public class HelloServiceImpl03 implements HelloService {
    public String hello(String name, String msg) {
        return "HelloServiceImpl03: hello, " + name + ", " + msg;
    }

    public String hi(String name, String msg) {
        return "HelloServiceImpl03: hi, " + name + ", " + msg;
    }
}
