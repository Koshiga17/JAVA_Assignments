package com.cts;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c) {
			System.out.println("Smallest num is: "+a);
		}
		else if(b<a&&b<c) {
			System.out.println("Smallest num is: "+b);
		}
		else {
			System.out.println("Smallest num is: "+c);
		}

	}

}
