package cn.edw.demo04.service.impl;

import cn.edw.api.HelloService;
import cn.edw.demo04.service.MyHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Edwin Xu
 * @date 5/19/2021 7:15 PM.
 */

@Service
public class MyHelloServiceImpl implements MyHelloService {

    /**
     * DubboReference 使用的服务
     * loadbalance指定负载均衡策略，有random, roundrobin, leastactive(最少活跃)
     * */
    @DubboReference(loadbalance = "roundrobin")
    private HelloService helloService;

    public String sayHello() {
        return helloService.hello("edw", "how are you?");
    }

    public String sayHi() {
        return helloService.hi("Edwin Xu", "I like you!");
    }
}
