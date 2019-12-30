package com.spring.firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MobilePhone m = (MobilePhone)ctx.getBean("nokia");
        System.out.println(m.toString());
        m.makeCall();
    }
}
