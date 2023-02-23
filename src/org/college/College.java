package org.college;

public class College {
private void collegeName() {
	// TODO Auto-generated method stub
System.out.println("islamiah");
}
private void collegeCode() {
	// TODO Auto-generated method stub
System.out.println("34577");
}
private void collegeRank() {
	// TODO Auto-generated method stub
System.out.println("2");
}
public static void main(String[] args) {
	College a=new College();
	a.collegeName();
	a.collegeCode();
	a.collegeRank();
	
	Student b=new Student();
	b.studentName();
	b.studentDept();
	b.studentId();
	
	Hostel c=new Hostel();
	c.hostelName();
	
	Dept d=new Dept();
	d.deptName();
	
}
}
