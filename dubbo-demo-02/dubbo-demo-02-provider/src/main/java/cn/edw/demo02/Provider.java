package cn.edw.demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/14/2021 11:09 PM.
 */

public class Provider {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Demo02ProviderConfig.class);
        ctx.start();
        System.in.read();
    }
}
