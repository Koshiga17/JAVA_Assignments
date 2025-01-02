package com.cts;
import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double number1=sc.nextDouble();
		double number2=sc.nextDouble();
		double number3=sc.nextDouble();
		double res=(number1+number2+number3)/3;
		System.out.println("The average value is: "+res);
	}

}
