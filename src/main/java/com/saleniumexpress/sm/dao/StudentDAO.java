package com.saleniumexpress.sm.dao;

import java.util.List;

import com.saleniumexpress.sm.api.Student;

public interface StudentDAO {
	
	List<Student> loadAllStudents();
	void saveStudent(Student student);
	Student getStudent(int id);
	void updateStudent(Student student);
	void deleteStudent(int id);
}
