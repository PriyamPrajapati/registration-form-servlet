package com.jsp.student_crud.service;

import java.util.List;

import com.jsp.student_crud.dao.StudentDao;
import com.jsp.student_crud.dto.Student;

public class StudentService {
//	insert
  StudentDao studentDao = new StudentDao();
	
	public Student saveStudent(Student student) {
		
		return studentDao.saveStudent(student);
		
	}
//delete
  public int deleteStudent(int id) {
		
		return studentDao.deleteStudent(id);
		
	}
//  update
  public int updateStudent(Student student, int id)
  {
	  return studentDao.updateStudent(student,id);
  }
//  display
  public List<Student> displayStudents() {
	  
		return studentDao.displayStudents();
	}


 
}
