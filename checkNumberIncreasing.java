package com.cts;

public class Task3 {
	public boolean checkNumber(int number) {
		String numStr=Integer.toString(number);
		for(int i=0;i<numStr.length() - 1;i++) {
			if(numStr.charAt(i) > numStr.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number=134468;
		Task3 check=new Task3();
		System.out.println("The number " + number + " is increasing: "+check.checkNumber(number));
		
	}

}
