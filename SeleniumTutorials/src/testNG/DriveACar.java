//Video:2 
//How to set priority to test cases - order of execution.
//testNG:testNG always execute the methods based on the alphabetical order.
//Priority: It is the Keyword that can be used to see in @Test.
//@Test anotation ku priority attribute ah pass panikalaam,which accepts integer value.
//So after giving priority=0,etc
//It will run based on the priority value set.
package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority=0)
	public void startTheCar() {
	
		System.out.println("Start the Car");
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

