package com.test.main;
import com.test.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.String;
public class Main {
    public static void main(String[] args){

        String config = "com/test/resources/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student std = (Student) context.getBean("std1");

        System.out.println(std.getRoll_no());
        System.out.println(std.getName());
        System.out.println(std.getEmail());

    }
}
