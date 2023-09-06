package com.example.handlinglists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.handlinglists.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String listStudents(Model model) {
		
		ArrayList<Student> students = new ArrayList<Student>(); 
		
		Student student1 = new Student("Kate", "Cole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		// Pass data from the controller to the Thymeleaf template 
		model.addAttribute("studentlist", students);
		
		return "students";
		
	}

}
