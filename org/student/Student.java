package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("sara");
	}

	public void studentDept() {
		System.out.println("ECE");
	}

	public void studentId(){
		System.out.println("01146");
	}

	public static void main(String[] args) {
		Student present=new Student();
		present.collegeCode();
		present.studentId();
		present.deptName();
		present.studentName();
	}

}
