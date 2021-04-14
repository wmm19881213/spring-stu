package com.spr.source.run;

import com.spr.source.vo.People;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestContext {

    @Test
    public void testContext(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        People people = (People) bf.getBean("people");
        System.out.println(people.getName());
    }

}
