package javaConfig.controller;

import javaConfig.config.ApplicationContext;
import javaConfig.service.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Di Guan on 7/27/2021 9:30 PM
 */

public class StudentController {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
        StudentService stuService = (StudentService) context.getBean("studentService");
        stuService.fetchStudents();
    }
}
