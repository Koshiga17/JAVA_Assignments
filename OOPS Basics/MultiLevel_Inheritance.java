package com.cts;
class Ani {
	String name;
	public void eat() {
		System.out.println(name+" is eating");
	}
	public void sleep() {
		System.out.println(name+" is sleeping");
	}
}
class Mammal extends Animal {
	public void walk() {
		System.out.println(name+" is walking");
	}
}
class Doggy extends Mammal {
	public void bark() {
		System.out.println(name+" is barking");
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Doggy dog=new Doggy();
		dog.name="Buddy";
		dog.eat();
		dog.sleep();
		dog.walk();
		dog.bark();
		
		

	}

}
