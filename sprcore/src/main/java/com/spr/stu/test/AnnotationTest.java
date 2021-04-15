package com.spr.stu.test;

import com.spr.stu.config.AnnotationConfig;
import com.spr.stu.vo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
    @Test
   public void testAnnotation(){
       ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
       People people = context.getBean(People.class);
       System.out.println("people:"+people);
   }
}
