package com.saleniumexpress.sm.service;

import java.util.List;

import com.saleniumexpress.sm.api.Student;

public interface Servicelayer {
      List<Student> loadStudents();
      void saveStudent(Student student);
      Student getStudent(int id);
      void updateStudent(Student student);
	  void deleteStudent(int id);
}
