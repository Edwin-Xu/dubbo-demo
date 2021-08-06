package cn.edw.demo05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/22/2021 10:23 PM.
 */

public class Consumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ctx.start();
        // HelloBusiness的DubboReference注解中，如果check设置为false则这里会正常执行，
        // 否则如果没有相应的依赖服务，启动会失败
        System.out.println("Consumer Is Ready!");

        HelloBusiness helloBusiness = ctx.getBean("HelloBusiness", HelloBusiness.class);
        helloBusiness.sayHi("edwin", "how are you?");
    }
}
