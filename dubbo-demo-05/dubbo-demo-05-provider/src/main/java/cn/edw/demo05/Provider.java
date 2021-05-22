package cn.edw.demo05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/22/2021 10:23 PM.
 */

public class Provider {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        ctx.start();
        System.out.println("Provider Is Ready!");

        System.in.read();
    }
}
