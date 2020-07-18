package org.studyeasy.abstractclasses;

/* If we use prefix as "abstract", then the class is said to be Abstract Class.
   Interfaces will only have declaration but not implementation and has complete Abstraction
   Abstract class has implementation, variables and also abstract methods.
   If Abstract class implements Interfaces,the classes which extends Abstract class or the Abstract class itself
   should also implement the methods in interfaces. */

public abstract class Person implements IsAlive, LiveLife {
	
	public void speak() {
		
		System.out.println("Shares his/her thoughts.");
		
	} 
	
	// IS a relationship, use ABstract Class.
	// Can relationship, use Interfaces.
	// MUltiple inheritance, use Interfaces.
	
	@Override
	public void breathe() {
		System.out.println("Be alive; remain living.");
	}
	
	@Override
	public void message() {
		System.out.println("Life is a journey, keep moving and meet new people. ");
	}
	
	
	
	public abstract void eat();
	
	

}
