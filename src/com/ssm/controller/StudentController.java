package com.ssm.controller;

import com.ssm.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ssm.service.StudentService;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	@GetMapping("/addStudent")
	public String showAddForm() {
		return "add";
	}

	@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
	public String addStudent(Student student,Model model) {
		studentService.addStudent(student);
		List<Student> stu=studentService.searchall();
		model.addAttribute("students", stu);
		return "forward:/student/searchall" ;
	}


	@RequestMapping("searchall")
	public String searchall(Model model) {
		List<Student> stu=studentService.searchall();
		model.addAttribute("students", stu);
		return "show" ;
	}

	@RequestMapping("deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") Integer id,Model model) {
		studentService.deleteStudent(id);
		List<Student> stu=studentService.searchall();
		model.addAttribute("students", stu);
		return "show" ;
	}

	@RequestMapping("queryStudentByNo/{id}")
	public String queryStudentByNo(@PathVariable("id") Integer id , Model model) {
		Student student = studentService.queryStudentByNo(id) ;
		model.addAttribute("student", student) ;
		return "edit";
	}

	@RequestMapping(value = "updateStudent",method = RequestMethod.POST)
	public String updateStudent(Student student) {

		studentService.updateStudent(student);
		return "forward:/student/searchall" ;
	}





	

}
