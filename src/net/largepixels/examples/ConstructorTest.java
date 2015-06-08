package net.largepixels.examples;

/**
 * 
 * @author sporkit
 * 
 * Overload the constructor causes its default constructor to disappear.
 * Overload: add arguments
 * Override: replace implementation from a parent
 *
 */
public class ConstructorTest {
	
	public ConstructorTest(String greeting) {
		System.out.println(greeting);
	}

	public static void main(String[] args) {
		ConstructorTest a = new ConstructorTest();  //this wont work, default constructor disappears after overloading
		ConstructorTest b = new ConstructorTest("holler");
	}
	
	/*
	 * Output if we ran main...
	 * 
	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor ConstructorTest() is undefined

	at net.largepixels.examples.ConstructorTest.main(ConstructorTest.java:20)
	 */

}
