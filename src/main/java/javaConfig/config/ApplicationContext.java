package javaConfig.config;

import javaConfig.mapper.StudentMapper;
import javaConfig.mapper.StudentMapperImpl;
import javaConfig.service.StudentService;
import javaConfig.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class, similar to applicationContext.xml
 * 这时一个核心容器的配置文件
 * 与applicationContext.xml文件类似，只不过以Java代码+注解的方式代替
 * 其他的类如果需要这个Java配置文件中的Bean，直接来获取即可
 * @author Di Guan on 7/27/2021 9:29 PM
 */

@Configuration
public class ApplicationContext {

    //将StudentMapper Bean注册到容器中
    @Bean
    public StudentMapper studentMapper(){
        return new StudentMapperImpl();
    }

    //将StudentService Bean注册到容器中
    @Bean
    public StudentService studentService(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        //将StudentMapperImpl对象注入到StudentServiceImpl中
        //Java文件中StudentServiceImpl类中必须要有setStudentMapper的方法
        studentService.setStudentMapper(studentMapper());
        return studentService;
    }

}
