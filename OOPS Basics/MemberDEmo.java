package com.cts;
class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	public void printSalary() {
		System.out.println("Salary: "+salary);
	}
}
class Employee extends Member {
	String specialization;
	public void displayEmployeeDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Specialization: "+specialization);
		printSalary();
	}
}
class Manager extends Member {
	String department;
	public void displayManagerDetails() {
		System.out.println("Manager Details:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Department: "+department);
		printSalary();
	}
}


public class MemberDemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="John";
		emp.age=30;
		emp.phoneNumber="1234567890";
		emp.address="Chennai";
		emp.salary=50000.0;
		emp.specialization="Software Development";
		Manager man=new Manager();
		man.name="Jane";
		man.age=40;
		man.phoneNumber="12394829293";
		man.address="Hyderabad";
		man.salary=800000.0;
		man.department="IT";
		
		emp.displayEmployeeDetails();
		System.out.println();
		man.displayManagerDetails();
		
		

	}

}
