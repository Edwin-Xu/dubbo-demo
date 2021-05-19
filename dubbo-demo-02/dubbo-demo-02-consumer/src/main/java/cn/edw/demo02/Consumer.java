package cn.edw.demo02;

import cn.edw.api.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/14/2021 11:09 PM.
 */

@Component
public class Consumer {
    @Reference
    private HelloService helloService;

    public void sayHello(String name, String msg){
        System.out.println(helloService.hello(name, msg));
    }
}
