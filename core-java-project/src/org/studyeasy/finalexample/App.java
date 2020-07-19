package org.studyeasy.finalexample;

// final keyword can be used in 3 levels. It can be used for variables, methods and classes.

public class App {

	public static void main(String[] args) {
		 B obj1 = new B();
		 System.out.println(obj1.getX()); //prints x = 5
		 
		 obj1.setX(10);
		 System.out.println(obj1.getX()); // prints x = 10
		 
		 C obj2 = new C();
		 System.out.println(obj2.getY());
		 obj2.india(); //Overridden in 'C' Class
		 obj2.USA(); // prints content in 'A'Class
		 

	}

}
