package com.cbahern.webdriver;

import com.sun.corba.se.impl.orb.ParserTable;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Charlie Ahern
 * Date: 8/7/13
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver() {

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://cbahern.com");

        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("CBAhern"));

        driver.close();

    }
}
