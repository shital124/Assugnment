package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Student;
 
import com.example.repository.StudentRepository;

public class StudentSevice {
	private StudentRepository repo;
	 public List<Student> getData(Student stud){
		 List<Student> list=new ArrayList();
		 list.add(new Student(stud.getName(), stud.getEmail(), stud.getMobileNumber(), stud.getCor()));
		  
		 return list;
	 }
	 public Student getDelete(@PathVariable int id) {
		 return repo.deleteById;
	 }
}
