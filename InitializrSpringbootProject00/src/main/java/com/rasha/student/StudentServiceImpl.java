
package com.rasha.student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author RASHA
 */
@Service
public class StudentServiceImpl implements StudentService{
    List<Student> list=new ArrayList();
    
    @Override
    public List<Student> getAll() {
      return list;
    }

    @Override
    public Student addStudent(Student student) {
       list.add(student);
       return student;
    }

    @Override
    public String deletStudent(int id) {
        for (Student student : list) {
            if (student.getId()==id) {
              list.remove(student);
          break;  }
        }
        return "delet shod";
    }
    
}
