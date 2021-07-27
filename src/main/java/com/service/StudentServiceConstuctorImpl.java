package com.service;

import com.mapper.StudentMapper;

/**
 * @author Di Guan on 7/27/2021 4:19 PM
 */

public class StudentServiceConstuctorImpl implements StudentService{

    //xml+constructor(构造注入)
    private StudentMapper studentMapper;
    private String studenName;

    public StudentServiceConstuctorImpl() {}
    public StudentServiceConstuctorImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }
    public StudentServiceConstuctorImpl(StudentMapper studentMapper, String studenName) {
        this.studentMapper = studentMapper;
        this.studenName = studenName;
    }
    @Override
    public void fetchStudents() {
        studentMapper.fetchStudents();
        System.out.println(studenName);
    }
}
