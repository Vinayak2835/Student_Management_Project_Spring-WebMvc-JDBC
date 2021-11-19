package com.saleniumexpress.sm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.saleniumexpress.sm.api.Student;
import com.saleniumexpress.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Student> loadAllStudents() {
		//Write a logic to access the data from the database
		String sql = "select * from students";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		return studentList;
	}
	
	@Override
	public void saveStudent(Student student) {
		// write a logic to store the student data into the database
		
		Object[] sqlParameters = {student.getName(),student.getMobile(),student.getCountry()};
		String sql = "insert into students(name,mobile,country) values(?,?,?)";
		jdbcTemplate.update(sql,sqlParameters);
		
		System.out.println("1 record got updated");
		
	}

	@Override
	public Student getStudent(int id) {
		String sql = "select * from students where id = ?";
		Student theStudent = jdbcTemplate.queryForObject(sql, new StudentRowMapper(),id);
		return theStudent;
	}

	@Override
	public void updateStudent(Student student) {
		
		String sql = "Update students set name = ?, mobile = ?, country = ? where id = ?";
		jdbcTemplate.update(sql, student.getName(),student.getMobile(),student.getCountry(),student.getId());
		
		System.out.println("Record got updated");
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "delete from students where id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("1 Record got deleted");
	}
}
