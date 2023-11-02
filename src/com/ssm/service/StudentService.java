package com.ssm.service;

import java.util.List;

import com.ssm.po.Student;

public interface StudentService {
	//根据ID查询学生
	//public Student findStudentById(Integer id);
	//根据班级clazz_id查询学生
	List<Student> searchall();
	//添加学生
	void addStudent(Student student);
	//删除学生
	void deleteStudent(Integer id);

	//修改
	void updateStudent(Student student);


	Student queryStudentByNo(Integer id);
}
