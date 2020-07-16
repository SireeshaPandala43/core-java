package org.studyeasy.interfaces;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new OnePlus5();
		
		System.out.println("OnePlus5");
		
		System.out.println("OS: " +phone.OS()); //OnePlus5
		
		System.out.println("Processor: " + phone.processor());
		
		System.out.println("Space: " + phone.spaceInGB() + "GB");
		
		System.out.println("**********************");
		
		Phone phone1 = new Iphone8();
		
		System.out.println("Iphone");
		
		System.out.println("OS: " +phone1.OS()); //Iphone8
		
		System.out.println("Processor: " +phone1.processor());
		
		System.out.println("Space: " +phone1.spaceInGB() + "GB");

	}

}
