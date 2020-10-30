package io.hackages.learning.exercise00;

import io.hackages.learning.base.TestNgTestBase;
import io.hackages.learning.common.pages.HomePage;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}