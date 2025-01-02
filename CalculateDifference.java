package com.cts;

public class Task2 {
	public int CalculateDifference(int n) {
		int sum=0;
		int sumOfSquares=0;
		for(int i=1;i<=n;i++) {
			sumOfSquares+=i*i;
			sum+=i;
		}
		int squareOfSum=sum*sum;
		return squareOfSum-sumOfSquares;
	}

	public static void main(String[] args) {
		Task2 calculate=new Task2();
		System.out.println(calculate.CalculateDifference(10));
	}

}
