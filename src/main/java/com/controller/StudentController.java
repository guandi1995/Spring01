package com.controller;

import com.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * controller
 *
 * @author Di Guan on 7/27/2021 10:58 AM
 */

public class StudentController {
    //传统无IOC，需要new对象
//    private StudentService studentService = new StudentServiceImpl();

    @Test
    public void test01(){
        /**
         * controller需要使用StudentServiceImpl类，所以从容器中获取。
         * 容器中StudentServiceImpl类的别名id是stuService
         * 为了获取stuService，容器会自动创建new StudentServiceImpl和StudentMapperImpl
         * new的StudentServiceImpl会调用setStudentMapper的方法获取StudentMapper
         */

        //xml+setter
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
        StudentService studentService = (StudentService)context.getBean("stuService");
        studentService.fetchStudents();

        //xml+autowire(byName)
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContextAutoWireByName.xml");
        StudentService studentService1 = (StudentService) context1.getBean("stuService");
        studentService1.fetchStudents();

        //xml+autowire(byType)
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextAutoWireByType.xml");
        StudentService studentService2 = (StudentService) context2.getBean("stuService");
        studentService2.fetchStudents();

        //xml+constructor
        ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");
        StudentService studentService3 = (StudentService) context3.getBean("stuServiceConstructor");
        studentService3.fetchStudents();

    }



}
