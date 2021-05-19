package cn.edw.demo01;

import cn.edw.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/14/2021 3:30 PM.
 *
 * xml 配置的方式
 */

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer-config.xml"});
        ctx.start();

        HelloService helloService = (HelloService) ctx.getBean("helloServiceImpl");
        System.out.println(helloService.hello("edw","how are you?"));
    }
}
