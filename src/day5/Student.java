package day5;

import java.io.Serializable;

public class Student //implements Comparable<Student>
{

	private int rno;
	private String sname;
	private double per;
	
	public void displayPerson()
	{
		System.out.println("Student roll number is "+this.rno);
		System.out.println("Student Student Name is "+this.sname);
		System.out.println("Student Percentage is "+this.per);
	}

	public Student()   				//NoArgsContructor
	{
		this.rno=18;
		this.sname="Virat";
		this.per=78.5;
	}
	
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

//	@Override
//	public int compareTo(Student s1) {
//		if(rno>s1.rno)
//			return 1;
//		else if(rno<s1.rno)
//			return -1;
//		else
//			return 0;
//	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

//@Override
//public int compareTo(Student s1) {
//	if(per>s1.per)
//		return -1;
//	else if(per<s1.per)
//		return 1;
//	else
//		return 0;
//}

//@Override
//public int compareTo(Student s1) {
//	return sname.compareTo(s1.sname);
//}
	
	
	
}
