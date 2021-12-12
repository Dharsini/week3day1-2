package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Archana Dharsini G K ");
	}

	public void studentDept() {
		
		System.out.println("student's dept is EEE");
	}
	
	public void studentId()
	{
		System.out.println("1213017");
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();
	}
}

