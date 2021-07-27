package annotation.mapper;

import org.springframework.stereotype.Component;

/**
 * @author Di Guan on 7/27/2021 4:53 PM
 */


//相当于xml文件中的<bean class="annotation.mapper.StudentMapperImpl">
@Component("stuMapper2")
public class StudentMapperImpl2 implements StudentMapper{
    @Override
    public void fetchStudents() {
        System.out.println("fetch student info using annotation blur blur");
    }
}
