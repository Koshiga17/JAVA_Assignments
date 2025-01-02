package com.cts;
import java.util.Scanner;
public class Task5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("First num: ");
		int num1=sc.nextInt();
		System.out.print("Second num: ");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int rem=num1%num2;
		
		System.out.println("Sum: "+sum);
		System.out.println("Sub: "+sub);
		System.out.println("mul: "+mul);
		System.out.println("div: "+div);
		System.out.println("rem: "+rem);
		
		sc.close();
		

	}

}
