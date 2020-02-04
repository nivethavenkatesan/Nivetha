package first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class beforeandafter {
  @Test
  public void f() {
	  System.out.println("one");
  }
  @Test
  public void f1() {
	  System.out.println("two");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }
}


