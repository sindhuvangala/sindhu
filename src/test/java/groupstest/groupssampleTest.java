package groupstest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class groupssampleTest {
  @Test(groups="name")
  public void f() {
	  System.out.println("i am sindhu");
	  
  }
  @Test(groups="place")
  public void g() {
	  System.out.println("i belong to hyd");
  }
  @Test(groups="about")
  public void h() {
	  System.out.println("am a gnitc student");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
