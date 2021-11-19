package com.saleniumexpress.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saleniumexpress.sm.api.Student;
import com.saleniumexpress.sm.service.Servicelayer;

@Controller
public class StudentController {
	
	@Autowired
	private Servicelayer servicelayer;
    
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		// Call the loadStudent method to get the data
		
		List<Student> studentList = servicelayer.loadStudents();
		
		//To print the data in the console
		
		//for(Student stud:studentList) {
			//System.out.println(stud.getId()+" "+stud.getName()+" "+stud.getMobile()+" "+stud.getCountry());
			//System.out.println(stud);
		//}
		
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	//To add Student to the database
	
	@GetMapping("/addStudentPage")
	public String showStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("stud",student);
		
		return "add-student";
		
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student student) {
		//System.out.println(student);
		if(student.getId() == 0) {
		servicelayer.saveStudent(student);
		}
		else {
			servicelayer.updateStudent(student);
		}
		return "redirect:/showStudent";
    }
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id,Model model,Student student) {
		System.out.println(id);
		Student theStudent = servicelayer.getStudent(id);
		model.addAttribute("stud", theStudent);
		
		System.out.println(theStudent);   
		
		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@ModelAttribute("userId") int id) {
		
		servicelayer.deleteStudent(id);
		return "redirect:/showStudent";
		
	}
}
