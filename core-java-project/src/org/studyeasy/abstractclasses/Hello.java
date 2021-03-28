package org.studyeasy.abstractclasses;

public class Hello {

	public static void main(String[] args) {
		
		Person john = new Vegan();
		john.speak();
		john.eat();
		john.breathe();
		john.message();
		System.out.println("***************");
		System.out.println("Sireesha Practice");
		
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
		mia.breathe();
		mia.message();

	}

}
