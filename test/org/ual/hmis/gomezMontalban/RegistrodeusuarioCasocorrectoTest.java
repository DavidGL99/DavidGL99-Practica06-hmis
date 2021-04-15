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
public class RegistrodeusuarioCasocorrectoTest {
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
  public void registrodeusuarioCasocorrecto() {
    // Test name: Registro de usuario (Caso correcto)
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:1337/");
    // 2 | executeScript | return "ual-" + Math.floor(Math.random()*1500000)+"@ual.es" | emailrandom
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    // 3 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) | namerandom
    vars.put("namerandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)"));
    // 4 | setWindowSize | 750x691 | 
    driver.manage().window().setSize(new Dimension(750, 691));
    // 5 | click | linkText=Sign up | 
    driver.findElement(By.linkText("Sign up")).click();
    // 6 | click | id=full-name | 
    driver.findElement(By.id("full-name")).click();
    // 7 | type | id=full-name | ${namerandom}
    driver.findElement(By.id("full-name")).sendKeys(vars.get("namerandom").toString());
    // 8 | click | id=email-address | 
    driver.findElement(By.id("email-address")).click();
    // 9 | type | id=email-address | ${emailrandom}
    driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
    // 10 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 11 | type | id=password | 1234
    driver.findElement(By.id("password")).sendKeys("1234");
    // 12 | click | id=confirm-password | 
    driver.findElement(By.id("confirm-password")).click();
    // 13 | type | id=confirm-password | 1234
    driver.findElement(By.id("confirm-password")).sendKeys("1234");
    // 14 | click | id=terms-agreement | 
    driver.findElement(By.id("terms-agreement")).click();
    // 15 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
  }
}