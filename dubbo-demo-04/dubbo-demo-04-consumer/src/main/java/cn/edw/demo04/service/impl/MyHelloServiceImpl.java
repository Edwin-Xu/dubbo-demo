package cn.edw.demo04.service.impl;

import cn.edw.api.HelloService;
import cn.edw.demo04.service.MyHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author Edwin Xu
 * @date 5/19/2021 7:15 PM.
 *
 * Dubbo配置级别关系：
 * - 方法界别>接口界别>全局配置
 * - 级别系统，消费方>提供方
 */

@Service
public class MyHelloServiceImpl implements MyHelloService {

    /**
     * DubboReference 使用的服务
     * loadbalance指定负载均衡策略，有random, roundrobin, leastactive(最少活跃)
     *
     * timeout：这是服务级的
     * */
    @DubboReference(loadbalance = "random", timeout = 2000)
    private HelloService helloService;

    public String sayHello() {
        return helloService.hello("edw", "how are you?");
    }

    public String sayHi() {
        return helloService.hi("Edwin Xu", "I like you!");
    }
}
