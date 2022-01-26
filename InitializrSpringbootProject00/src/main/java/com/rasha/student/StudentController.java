/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasha.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RASHA
 */
@RestController
public class StudentController {
    @Autowired
    StudentServiceImpl studentCervice;
  
   @GetMapping("/get") 
    public List<Student>getAllData(){
        return studentCervice.getAll();
    }
    @PostMapping("/addStudent")
    public String postData(@RequestBody Student param){
        
        return "ezafe shod ba in id"+studentCervice.addStudent(param);
    }
    @GetMapping("delet/{id}")
    public String Delet(@PathVariable("id")int id){
        studentCervice.deletStudent(id);
        return "delet shod ba in id"+id;
    }
}
