package org.studyeasy.finalexample;

/*If we mark variable as 'final', then there won't be any setter method for that variable.
If we change any existing variable, for example 'y' into 'final', we will get an error
 at the setter method of 'y' and we should either remove final keyword or setter method.*/

public class C  {
   public final  int y= 20; // y=20; then will get an error in parameterized constructor

/*public C(int y) {
	super();
	this.y = y;
} */

/*public C() { //  public final  int y, if y is not initialized, this will get error.
	super();
}  */

public void india() {
	
	System.out.println("Hello India, What's Up?");
}

public int getY() {
	return y;
}

public void USA() {
 
	System.out.println("USA is fantastic! ");	
}


}
