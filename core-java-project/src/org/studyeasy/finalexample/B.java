package org.studyeasy.finalexample;

/*If we mark variable as 'final', then there won't be any setter method for that variable.
 If we change any existing variable, for example 'x' into 'final', we will get an error
  at the setter method of 'x'.*/

public class B  {
	
	private int x = 5;
	

	public B() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B(int x) {
		super();
		this.x = x;
	}
	

}
