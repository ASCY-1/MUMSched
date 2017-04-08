package com.ascy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.students.Student;
import com.ascy.entities.students.StudentService;

@RestController
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@RequestMapping("/student/{studentId}")
	public Student getStudent(@PathVariable("studentId") String studentId){
		Student st = studentService.getStudent(studentId);
		return st;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="student")
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}

}
