package com.service;

import com.mapper.StudentMapper;
import com.mapper.StudentMapperImpl;

/**
 * @author Di Guan on 7/27/2021 11:13 AM
 */

public class StudentServiceImpl implements StudentService {
    /**
     * 传统无IOC，需要new对象
     */
//    private StudentMapper studentMapper = new StudentMapperImpl();

    /**
     * 使用IOC和DI思想
     */
    //方式一:xml-based configuration
    private StudentMapper studentMapper;

    //xml+setter
    //xml+autowire
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void fetchStudents() {
        studentMapper.fetchStudents();
    }

}
