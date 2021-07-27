package javaConfig.service;

import javaConfig.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Di Guan on 7/27/2021 9:32 PM
 */
public class StudentServiceImpl implements StudentService{

    //声明属性和setter方法
    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void fetchStudents() {
        studentMapper.fetchStudents();
    }
}
