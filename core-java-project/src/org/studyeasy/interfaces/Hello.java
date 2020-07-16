package org.studyeasy.interfaces;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new OnePlus5();
		System.out.println(phone.processor()); //OnePlus5
		
		Phone phone1 = new Iphone8();
		System.out.println(phone1.OS()); //Iphone8

	}

}
