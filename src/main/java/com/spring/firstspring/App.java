package com.spring.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MobilePhone m = (MobilePhone)ctx.getBean(Nokia.class);
        System.out.println(m.toString());
        m.makeCall();
    }
}
