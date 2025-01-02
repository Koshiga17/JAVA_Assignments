package com.cts;

public class Task4 {
	public boolean checkNumber(int n) {
		if(n<=0) {
			return false;
		}
		return(n & (n-1))==0;
	}

	public static void main(String[] args) {
		Task4 check=new Task4();
		int number=8;
		System.out.println("The number "+number+" is a power of two: "+check.checkNumber(number));
		
	}

}
