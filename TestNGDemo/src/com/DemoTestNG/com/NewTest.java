package com.DemoTestNG.com;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {

  @Test (priority =2)
  public void b_testcase() {
	Assert.fail();
  }
  @Test (priority =0)
  public void c_testcase() {
	 Assert.assertTrue(true);
  }
  @Test (priority =1)
  public void a_testcase() {
	 throw new SkipException("Skip the test");

  }
}
