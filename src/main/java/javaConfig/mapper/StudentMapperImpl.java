package javaConfig.mapper;

import org.springframework.stereotype.Component;

/**
 * @author Di Guan on 7/27/2021 9:31 PM
 */
public class StudentMapperImpl implements StudentMapper{

    @Override
    public void fetchStudents() {
        System.out.println("fetch student info using java configuration");
    }
}
