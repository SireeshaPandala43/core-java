package org.studyeasy.abstractclasses;

//Class which extends Abstract class must implement the inherited Abstract methods.

public class NonVegan extends Person {

	@Override
	public void eat() {
		System.out.println("Eats Non Vegan Food.");
		
	}

}
