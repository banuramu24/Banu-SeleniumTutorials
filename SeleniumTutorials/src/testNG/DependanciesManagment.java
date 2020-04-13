//Video :4 
//How to handle dependencies?
//If I am using amazon site. server down means i can't do add to cart functionality.
//if there are 100 t.c, in this, if server eh down means,remaining 99 t.c execute panradhu total waste.
//Here i cannot put priority or enabled = false, bcoz that doesnt make sense.
//bcoz if i do that.. what happens? for eg: if i set (priority=0,enabled=false) for method highSchool().
//below remaining 2 t.c will get executed. which deosnt make sense.
//I should give dependsOnMethods() to overcome this, with enabled functionality.
package testNG;

import org.testng.annotations.Test;

public class DependanciesManagment {

	//problem1 : you have to admit a student to engineering.(he should be done with 12th)
	//problem2 : you have to admit a student to higher secondary.(he should be done with 10th)
	
	@Test(enabled=true)                          // --> Indicates Server.//Main function
	public void highSchool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("College");
	}
	
}

//If i run i will get exception,because i have given enabled=false for highSchool()
//So testNG.DependanciesManagment.higherSecondary() is depending on method 
//public void testNG.DependanciesManagment.highSchool(), which is not annotated with @Test or not included.