package com.ssm.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import com.ssm.po.Student;

@Mapper
public interface StudentMapper {
	

	//通过type属性指定生成动态查询tb_student表的动态SQL类和方法
	//@SelectProvider(type=StudentDynaSqlProvider.class,method="selectWithParam")
	//动态查询
	@Select("SELECT * FROM tb_student")
	List<Student> searchall();

	//通过type属性指定生成更新tb_student表的动态SQL类和方法
//	@UpdateProvider(type=StudentDynaSqlProvider.class,method="updateStudent")
	//动态更新
	@Insert("insert into tb_student(loginname,password,username,clazz_id) "
			+ "values(#{loginname},#{password},#{username},#{clazz_id})")
	void addStudent(Student student);

	@Update("update tb_student set loginname=#{loginname},password=#{password},username=#{username},clazz_id=#{clazz_id} where id=#{id} ")
	void updateStudent(Student student);

	@Select("select * from tb_student where id = #{id}")
	Student queryStudentByStuno(int stuno);

	@Delete("delete from tb_student where id=#{id}")
	void deleteStudent(Integer id);




}
