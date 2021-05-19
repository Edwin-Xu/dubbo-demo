package cn.edw.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/14/2021 11:12 PM.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext(ConsumerConfig.class);
        ctx.start();
        Consumer consumer = ctx.getBean(Consumer.class);
        consumer.sayHello("Edw", "how are you?");
    }
}
