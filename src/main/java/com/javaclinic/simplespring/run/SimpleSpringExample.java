package com.javaclinic.simplespring.run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaclinic.simplespring.services.TimeService;

/**
 * SimpleSpringExample shows a simple Spring container instantiate a TimeService object.
 * 
 * @author nevenc
 *
 */
public class SimpleSpringExample {

    @SuppressWarnings("resource")
    public static void main(String... args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        TimeService service = factory.getBean("timeservice", TimeService.class);
        System.out.println("Current time is now: " + service.getCurrentTimestamp());

    }

}
