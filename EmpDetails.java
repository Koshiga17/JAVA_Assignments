package com.cts;
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId: ");
		String empid=sc.next();
		System.out.println("Enter EmpName: ");
		String empname=sc.next();
		System.out.println("Enter salary: ");
		String empsal=sc.next();
		System.out.println("Enter Address: ");
		String empadd=sc.next();
		System.out.println("Enter gender: ");
		String empgen=sc.next();
		System.out.println("Enter Email: ");
		String email=sc.next();
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Salary: "+empsal);
		System.out.println("Employee Address: "+empadd);
		System.out.println("Employee gender: "+empgen);
		System.out.println("Employee email: "+email);

	}

}
