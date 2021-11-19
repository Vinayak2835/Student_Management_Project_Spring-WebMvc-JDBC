package com.saleniumexpress.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saleniumexpress.sm.api.Student;
import com.saleniumexpress.sm.dao.StudentDAO;

@Service
public class ServiceLayerImplementation implements Servicelayer {
    
	@Autowired
	private StudentDAO  studentDAO;
	
	@Override
	public List<Student> loadStudents() {
		
		List<Student> studentList = studentDAO.loadAllStudents();
	    return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		
		studentDAO.saveStudent(student);
	}

	@Override
	public Student getStudent(int id) {
	    Student theStudent = studentDAO.getStudent(id);
		return theStudent;
	}

	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
	}
}
