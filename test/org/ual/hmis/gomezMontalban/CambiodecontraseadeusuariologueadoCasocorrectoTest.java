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
import org.openqa.selenium.firefox.FirefoxOptions;
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
public class CambiodecontraseadeusuariologueadoCasocorrectoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe"); 
	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	FirefoxOptions firefoxOptions = new FirefoxOptions();
  	firefoxOptions.setHeadless(true);
    driver = new FirefoxDriver(firefoxOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cambiodecontraseadeusuariologueadoCasocorrecto() {
    // Test name: Cambio de contraseña de usuario logueado (Caso correcto)
    // Step # | name | target | value
    // 1 | open | /welcome | 
	  driver.get("http://gomezmontalban-sesion06.eastus.cloudapp.azure.com/");
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
	    
	    {
	    	  WebDriverWait wait = new WebDriverWait(driver, 30);
	    	  wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
	    }

    
    
    
    
    // 3 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 4 | click | linkText=Settings | 
    driver.findElement(By.linkText("Settings")).click();
    // 5 | click | linkText=Change password | 
    driver.findElement(By.linkText("Change password")).click();
    // 6 | executeScript | return Math.floor(Math.random()*15000) | cambioContraseña
    vars.put("cambioContraseña", js.executeScript("return Math.floor(Math.random()*15000)"));
    // 7 | type | id=password | ${cambioContraseña}
    driver.findElement(By.id("password")).sendKeys("${cambioContraseña}");
    // 8 | click | id=confirm-password | 
    driver.findElement(By.id("confirm-password")).click();
    // 9 | type | id=confirm-password | ${cambioContraseña}
    driver.findElement(By.id("confirm-password")).sendKeys("${cambioContraseña}");
    // 10 | click | css=.button-text | 
    
    {
    	  WebDriverWait wait = new WebDriverWait(driver, 30);
    	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-text")));
    }
    
    driver.findElement(By.cssSelector(".button-text")).click();
	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='header-account-menu-link']")));
    {
  	  WebDriverWait wait = new WebDriverWait(driver, 30);
  	  wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
  }
    // 11 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 12 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
    // 13 | type | css=.form-group:nth-child(2) > .form-control | nAvXT6vYTnqa22
    // 14 | type | css=.form-group:nth-child(1) > .form-control | gmm753@inlumine.ual.es
    
    {
  	  WebDriverWait wait = new WebDriverWait(driver, 30);
  	  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".form-group:nth-child(1) > .form-control")));
  }
    
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys(vars.get("emailrandom").toString());
    // 15 | click | css=.form-group:nth-child(2) > .form-control | 
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
    // 16 | type | css=.form-group:nth-child(2) > .form-control | ${cambioContraseña}
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("${cambioContraseña}");
    // 17 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 18 | click | css=h1 | 
    driver.findElement(By.cssSelector("h1")).click();
    // 19 | assertText | xpath=//div[@id='welcome']/div[2]/h1 | Welcome!
    
    {
  	  WebDriverWait wait = new WebDriverWait(driver, 30);
  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'welcome\']/div[2]/h1")));
  }
  }
}
