//Parameterization in testNG..
//Usually it is run through xml.
//Naaney user i/p testNG moolama dhan kuduthaaganum means,
//Parameterization testNG is widely used.
//Especially used to update in ALM.
//First write a method here.
//i dont want to hardcode a name value here.
package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test
	@Parameters("Name")
	public void printName(String name) {  //To receive value "Duck" I need a string variable.
		System.out.println("Name is" + name);
	}
}
