package annotation.controller;

import annotation.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Di Guan on 7/27/2021 4:52 PM
 */

public class StudentController {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnno.xml");
        StudentService studentService = (StudentService) context.getBean("stuServiceAnno");
        studentService.fetchStudents();
    }
}
