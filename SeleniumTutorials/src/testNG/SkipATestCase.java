//Video:3
//How to Skip A Test Case?
//Just by setting the (enabled) attribute to false.
//enabled : It is a boolean variable, by default it will have value as true.
package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	@Test(priority=0)
	public void startTheCar() {
	
		System.out.println("Start the Car");
	}
	
	@Test(priority=5,enabled=false)
	public void turnTheMusicOn() {
		System.out.println("Music turned ON");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		
		System.out.println("First Gear");
	}
	
	
	@Test(priority=2)
    public void putSecondGear() {
		
		System.out.println("Second Gear");
	}
	
	
	@Test(priority=3)
    public void putThirdGear() {
		
		System.out.println("Third Gear");
	}

	@Test(priority=4)
    public void putFourthGear() {
		
		System.out.println("Fourth Gear");
	}
}
