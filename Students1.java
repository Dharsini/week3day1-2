package org.student;

public class Students1 {
	
	public void getStudentInfo(int id) {
		
		System.out.println(id);
		
	}
	public void getStudentInfo(int id, String name) {
		
		System.out.println(id+name);
		
	
		
		
	}
	
public void getStudentInfo(String emailid, int phno) {
		
		System.out.println(emailid+phno);
		
		
	}
	
	public static void main(String[] args) {
		
		Students1 obj = new Students1();
		obj.getStudentInfo("dharsinieee@gmail.com", 99000);
	}
}
