//Video:1 : Testing FrameWork
//*TestNG : Cannot have main functions.
//*It is a framework which has some built-in functions,Gives some status(pass/fail).
//*It will give output like reports kindoff,So only we use testNG frameworks.
//*It will give some minimised details.
//*Reporting.
//Why it is majorly used?
//For solving real-time Business Requirements/Challenges.
//If we use @test anotation,it will consider as TestCase.
//Only 1 time run for all complex applications,We can't use java,so we use testNG to overcome.
//So it will run as testNG testcase.
//@Test always executes based on the alphabetical order.
package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {

	@Test
	public void firstTestCase()
	{
		System.out.println("This is the first test case");
	}
	
	/*
	 * @Test public void secondTestCase() {
	 * System.out.println("This is the first test case"); }
	 * 
	 * @Test public void thirdTestCase() {
	 * System.out.println("This is the first test case"); }
	 * 
	 * @Test public void fourthTestCase() {
	 * System.out.println("This is the first test case"); }
	 */
}
 