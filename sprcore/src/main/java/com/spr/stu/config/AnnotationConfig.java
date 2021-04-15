package com.spr.stu.config;

import com.spr.stu.vo.People;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AnnotationConfig {
    @Bean
    public People getPeople(){
        return new People("Tome",3);
    }
}
