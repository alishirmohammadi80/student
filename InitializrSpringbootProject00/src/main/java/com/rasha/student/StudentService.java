
package com.rasha.student;

import java.util.List;

/**
 *
 * @author RASHA
 */
public interface StudentService {
    List<Student> getAll();
    Student addStudent (Student student);
  String deletStudent(int id);
    
}
