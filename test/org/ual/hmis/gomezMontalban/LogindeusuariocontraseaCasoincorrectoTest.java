package org.ual.hmis.gomezMontalban;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LogindeusuariocontraseaCasoincorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe"); 
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void logindeusuariocontraseaCasoincorrecto() {
    // Test name: Login de usuario contraseña (Caso incorrecto)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:1337/");
    // 2 | setWindowSize | 1280x722 | 
    driver.manage().window().setSize(new Dimension(1280, 722));
    // 3 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    // 4 | type | css=.form-group:nth-child(1) > .form-control | gmm753@inlumine.ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("gmm753@inlumine.ual.es");
    // 5 | click | css=.form-group:nth-child(2) > .form-control | 
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
    // 6 | click | css=.container-fluid | 
    driver.findElement(By.cssSelector(".container-fluid")).click();
    // 7 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 8 | mouseOver | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 9 | mouseOut | css=.ajax-button | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 10 | click | css=.invalid-feedback | 
    driver.findElement(By.cssSelector(".invalid-feedback")).click();
    // 11 | assertText | css=.invalid-feedback | Please enter your password.
    assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Please enter your password."));
  }
}