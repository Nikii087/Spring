package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemp;

	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r=this.jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		String query="update student set name=?,city=? where id=?";
		int r = this.jdbcTemp.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int r =this.jdbcTemp.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowmapper=new RowMapperImpl();
		Student student=this.jdbcTemp.queryForObject(query, rowmapper ,studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> students=this.jdbcTemp.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}

	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}

	
	

	


}
