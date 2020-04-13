//VIDEO :10 Assertions in testNG.
//What is Assertions?
//content equal or not, true or not, for all these fetures testNG has built-in functions in it.
//To check given values are equal.
//Mainly used for unit testing purpose.
//Assertions :- Basically for self-check purpose.
//unit testing : Self-review panni test panradhu is called Assertion.
package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

	String name="Agni";
	boolean value=false;
	
	@Test
	public void checkEqual() {
		/* Usually In JAVA we do like below..
		 * if(name.equals("Agni")) 
		 * {
		 *  System.out.println("Name is equal"); } 
		 * else 
		 * {
		 * System.out.println("Name is NOT equal"); }
		 */
		
	//How to do using Assertions?
		//Assert.assertEquals(name, "agni");  //Basically for string type of values.
		//Assert.assertNotEquals(name, "agni"); //Basically for string type of values.
		Assert.assertTrue(value, "This should not be true");
		//Assert.assertFalse(value, "This should not be true");
		//Assert.assertSame(actual, expected); --> Used for comparing 2 objects.
	}
	
}
