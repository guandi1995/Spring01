package annotation.service;

import annotation.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Di Guan on 7/27/2021 4:53 PM
 */
//相当于xml文件中的<bean id="stuServiceAnno" class=""annotation.mapper.StudentServiceImpl>
@Component("stuServiceAnno")
public class StudentServiceImpl implements StudentService{

//    @Autowired
//    @Qualifier("stuMapper2")
//    private StudentMapper studentMapper;

    @Resource(name = "stuMapper1")
    private StudentMapper studentMapper;

    @Override
    public void fetchStudents() {
        studentMapper.fetchStudents();
    }
}
