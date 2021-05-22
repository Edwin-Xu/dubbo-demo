package cn.edw.demo05;

import cn.edw.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/22/2021 10:30 PM.
 */

@Component("HelloBusiness")
public class HelloBusiness {
    /**
     * 1. check = false 启动时不检查依赖，即如果没有HelloService的实现服务，也不会报错
     *   默认是true的，即启动时检查
     * 2. retries: 失败后尝试的次数，注意：不包含第一次。 是在failover的容错模式下
     *
     * */
    @DubboReference(loadbalance = "roundrobin",
            check = false,
            retries = 2,
            cluster = "failover")
    private HelloService helloService;

    public void sayHi(String name, String msg){
        System.out.println(helloService.hi(name, msg));
    }
}
