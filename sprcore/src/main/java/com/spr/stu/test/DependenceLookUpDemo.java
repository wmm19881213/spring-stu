package com.spr.stu.test;

import com.spr.stu.vo.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖查找
 */
public class DependenceLookUpDemo {
    @Test
    public void testLookUpMain(){
        BeanFactory bf = new ClassPathXmlApplicationContext("classpath:META-INF/dependence-lookup.xml");
//        lookupByName(bf);
        lookupByClass(bf);
    }

    private void lookupByName(BeanFactory bf) {
        User user = (User) bf.getBean("user");
        System.out.println("根据名称查找："+user);
    }

    private void lookupByClass(BeanFactory bf) {
        User user = (User) bf.getBean(User.class);
        System.out.println("根据class查找："+user);
    }

}
