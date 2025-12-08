package EncapsulaTion;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Roll");
		int roll=sc.nextInt();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter PC");
		boolean pc=sc.nextBoolean();
		
		System.out.println("Enter per");
		float pcmPer=sc.nextFloat();
		
		Student student = new Student();
//		student.setData(roll,age,gender,pc,pcmPer);
		student.setRoll(roll);
		student.setAge(age);
		student.setGender(gender);
		student.setPc(pc);
		student.setPcmPer(pcmPer);
		
		s.test(student);
	}
}