//How to group your test cases in testNg?
//add <groups> in testNG xml :) :) that's it..
package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
/*
 * Scenario : A Big Basket is having a different kind of mobiles.
 * Let us say there are apple phones,moto g,VIVO,Lenovo.
 * I want to run tests only for VIVO and moto phones.
 * Write a program for that.
 */
	
/*
* i)Now group 2 phones in each category.
*/
	
/*
* ii)Assign testNG anotation's. After giving @Test anotations,normally if we run, it will run
*  based on the alphabetical order..correct ah.
* iii)So here what is my criteria?? i need to run VIVO and moto groupwise.
*  here i can give [enabled=false] for apple and lenevo and i can run. but thats not the correct way.
*  because tomorrow if i asked to run apple and lenevo i cannot make moto and VIVO to false again.
*  So here comes the grouping concept.So go to xml file now and give, class.
*  where to give class?? inside <groups> only we will give, Check in TestNG.xml.
* iv)
*/
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Moto Testing");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("Moto Testing");
	}
	@Test(groups= {"Vivo"})
	public void VIVO1() {
		System.out.println("VIVO Testing");
	}
	@Test(groups= {"Vivo"})
	public void VIVO2() {
		System.out.println("VIVO Testing");
	}
	@Test(groups= {"Lenevo"})
	public void lenovo1() {
		System.out.println("Lenevo Testing");
	}
	@Test(groups= {"Lenevo"})
	public void lenovo2() {
		System.out.println("Lenevo Testing");
	}
}
