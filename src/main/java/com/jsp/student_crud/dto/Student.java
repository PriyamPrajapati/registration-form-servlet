package com.jsp.student_crud.dto;

public class Student {
	private int studentid;
	private String studentname;
	private String studentemail;
	private long studentphone;
	private String studentaddress;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public long getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(long studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	
	

}
