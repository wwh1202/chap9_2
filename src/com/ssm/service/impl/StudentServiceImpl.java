package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.StudentMapper;
import com.ssm.po.Student;
import com.ssm.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;


	@Override
	public Student queryStudentByNo(Integer id) {
		return  studentMapper.queryStudentByStuno(id) ;
	}


	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}


	@Override
	public List<Student> searchall() {
		return studentMapper.searchall();
	}

	@Override
	public void deleteStudent(Integer id) {
		studentMapper.deleteStudent(id);
	}
	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}

}
