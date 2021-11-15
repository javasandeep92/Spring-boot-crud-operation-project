package com.curdoperation.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdoperation.app.entity.StudentEntity;
import com.curdoperation.app.repository.StudentRepository;


@RestController
public class Student {
	
	@Autowired
	StudentRepository repo;
	
	
	@GetMapping("/hello")
	public String showHello() {
		
		return "Hello";
	}
	
	@PostMapping("/insert")
	public StudentEntity insertStudentDetail(@RequestBody StudentEntity student) {
		
		repo.save(student);
		
		return student;
	}
	
	
	@GetMapping("/studentdetail")
	public List<StudentEntity> getStudentDetail() {
		
     List<StudentEntity> studententity=repo.findAll();
		
	   return  studententity;
	}
	
	
	@PutMapping("/update")
	public StudentEntity updateStudentDetail(@RequestBody StudentEntity rollno) {
		
		StudentEntity stuentity =null;
		try {
			stuentity=  repo.save(rollno);
		}catch(Exception e) {
			 e.printStackTrace();
		}
		return rollno;
	}
	
	@DeleteMapping("delete/studentdetail/{rollno}")
	public Integer deleteStudentDetail(@PathVariable ("rollno") int rollno){
		
		     repo.deleteById(rollno);
		
		return rollno;
	}
	
	
	
	

}
