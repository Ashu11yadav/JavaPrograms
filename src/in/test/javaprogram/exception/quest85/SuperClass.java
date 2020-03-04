package in.test.javaprogram.exception.quest85;

import java.io.IOException;

public class SuperClass {

	public SuperClass() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * 85) Can we modify the throws clause of the superclass method while overriding
	 * it in the subclass?
	 * 
	 * Ans:
	 * 
	 * Yes, we can modify the throws clause of the superclass method while
	 * overriding it in the subclass. However, there are some rules which are to be
	 * followed while overriding in case of exception handling.
	 * 
	 * 1) If the superclass method does not declare an exception, subclass overridden
	 * method cannot declare the checked exception, but it can declare the unchecked
	 * exception. 
	 * 2)If the superclass method declares an exception, subclass
	 * overridden method can declare same, subclass exception or no exception but
	 * cannot declare parent exception.
	 * 
	 * 
	 */
	void checkException() {
		System.out.print("checkException");
	}

}
