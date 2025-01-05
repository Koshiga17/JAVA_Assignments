package com.cts;
class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public double add(int a,double b) {
		return a+b;
	}
	public double add(double a,int b) {
		return a+b;
	}
	public double diff(int a,int b) {
		return a-b;
	}
	public double diff(double a,double b) {
		return a-b;
	}
	public double diff(int a,double b) {
		return a-b;
	}
	public double diff(double a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public double mul(int a,double b) {
		return a*b;
	}
	public double mul(double a,int b) {
		return a*b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public double div(int a,int b) {
		if(b!=0) {
			return (double)a/b;
		} else {
			System.out.println("Error:Division by zero");
			return 0;
		}
	}
	public double div(double a,double b) {
		if(b!=0) {
			return (double)a/b;
		} else {
			System.out.println("Error:Division by zero");
			return 0;
		}
	}
	public double div(int a,double b) {
		if(b!=0) {
			return (double)a/b;
		} else {
			System.out.println("Error:Division by zero");
			return 0;
		}
	}
	public double div(double a,int b) {
		if(b!=0) {
			return (double)a/b;
		} else {
			System.out.println("Error:Division by zero");
			return 0;
		}
	}
	
	
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("\nAddition:");
		System.out.println("int +int: "+calc.add(10, 20));
		System.out.println("double+double: "+calc.add(10.5,20.5));
		System.out.println("int+double: "+calc.add(10, 20.5));
		System.out.println("double+int: "+calc.add(10.5, 20));
		
		System.out.println("\nSubtraction:");
		System.out.println("int -int: "+calc.diff(20, 10));
		System.out.println("double-double: "+calc.diff(20.5,10.5));
		System.out.println("int-double: "+calc.diff(20, 10.5));
		System.out.println("double-int: "+calc.diff(20.5, 10));
		
		System.out.println("\nMultiplication:");
		System.out.println("int *int: "+calc.mul(5, 4));
		System.out.println("double*double: "+calc.mul(5.5,4.4));
		System.out.println("int*double: "+calc.mul(5, 4.4));
		System.out.println("double*int: "+calc.mul(5.5, 4));
		
		System.out.println("\nDivision:");
		System.out.println("int /int: "+calc.div(20, 4));
		System.out.println("double/double: "+calc.div(20.5,4.5));
		System.out.println("int/double: "+calc.div(20, 4.5));
		System.out.println("double/int: "+calc.div(20.5, 4));
		
	}

}
