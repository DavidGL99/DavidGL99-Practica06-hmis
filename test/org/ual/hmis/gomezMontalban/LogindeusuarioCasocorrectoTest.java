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
public class LogindeusuarioCasocorrectoTest {
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
  public void logindeusuarioCasocorrecto() {
    // Test name: Login de usuario (Caso correcto)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:1337/");
    // 2 | setWindowSize | 1280x722 | 
    driver.manage().window().setSize(new Dimension(1280, 722));
    // 3 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    // 4 | type | css=.form-group:nth-child(2) > .form-control | nAvXT6vYTnqa22e
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("nAvXT6vYTnqa22e");
    // 5 | type | css=.form-group:nth-child(1) > .form-control | gmm753@inlumine.ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("gmm753@inlumine.ual.es");
    // 6 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 7 | assertText | xpath=//div[@id='welcome']/div[2]/h1 | Welcome!
    assertThat(driver.findElement(By.xpath("//div[@id=\'welcome\']/div[2]/h1")).getText(), is("Welcome!"));
  }
}