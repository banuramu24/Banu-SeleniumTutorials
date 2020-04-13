//VIDEO:11 Annotations order of Execution in TestNG..
//How i created this?
//Goto testNG->r8clk->new->other->[in searchbox type testNG]->click TestNG class->next->
//click all boxes except data provider in Annotations boxes->
//in XML suite file give [AnnotationsHierarchyExample as name] next->finish.
//See..after we create above,we will get methods,
//by default it will create @test method which has f() by default.
//Points to remember here: 
//If we have multiple @test we get o/p as for [each test we have one b4 method and after method].
package testNG;

import org.testng.annotations.Test; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHierarchyExample {
  @Test
  public void test2() {
	  System.out.println("I'm the actual testcase2");
  }	
  @Test
  public void test() {
	  System.out.println("I'm the actual testcase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I'm before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I'm after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I'm after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I'm before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I'm after suite");
  }

}
