package day4;

import static java.lang.Math.*;

public class Student {

	int rno;
	String sname;
	static String principalName;
	static String collegeName;
	static int yoe;
	static
	{
		principalName="Mr Smith";
		collegeName="Bishops";
		yoe=1864;
		System.out.print("Virat ");
	}
	public Student()//NoArgsConstructor
	{
		this.rno=1;
		this.sname="Rahul";
	}
	
	public static void main(String[] args) {
		System.out.println("Kohli");
		int radius=5;
		double areaCircle=PI*radius*radius;
		System.out.println(areaCircle);
		int jaipur=100;
		int pune=1400;
		
		System.out.println(abs(jaipur-pune));
	}

	@Override
	public String toString() {
		return "Student {rno=" + rno + ", sname=" + sname + "}";
	}
	
}
