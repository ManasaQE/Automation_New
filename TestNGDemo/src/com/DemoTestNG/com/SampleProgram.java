package com.DemoTestNG.com;

import org.testng.annotations.Test;

public class SampleProgram {

  @Test (priority =2)
  public void b_testcase() {
	  System.out.println("Test Case2");
  }
  @Test (priority =0)
  public void c_testcase() {
	  System.out.println("Test Case3");
  }
  @Test (priority =1)
  public void a_testcase() {
	  System.out.println("Test Case1");

  }
}
