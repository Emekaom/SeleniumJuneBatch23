package Mypackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeClass  
	 public void before_class()  
	 {  
	     System.out.println("This method is executed before Class2");  
	 }  
	 @Test  
	 public void testcase3()  
	 {  
	     System.out.println("Test case3");  
	 }  
	 @Test  
	 public void testcase4()  
	 {  
	     System.out.println("Test case4");  
	 }  
	 
	 @AfterClass
	 public void After_class() {
		 System.out.println("After Class");
	 }
	 
	 
}
