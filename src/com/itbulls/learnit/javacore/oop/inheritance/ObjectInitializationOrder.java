package com.itbulls.learnit.javacore.oop.inheritance;

public class ObjectInitializationOrder {
	
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("=====================");
		p = new Child();
		System.out.println("=====================");
		Child ch = new Child();
		p.parentMethod();
		ch.childMethod();
		ch.parentMethod();
		Child ch2 = (Child) new Parent();
		
		
		

	}

}


class Parent {
	static {
		System.out.println("Static init block parent");
	}
	
	{
		System.out.println("Init block parent");
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	public void parentMethod() {
		System.out.println("Parent parentMethod");
	}
	
	
}

class Child extends Parent {
	static {
		System.out.println("Static init block child");
	}
	
	{
		System.out.println("Init block child");
	}
	
	public Child() {
		System.out.println("child constructor");
	}
	public void childMethod() {
		System.out.println("child childMethod");
	}
	

}
