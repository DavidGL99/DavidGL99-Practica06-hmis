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

public class RegistrodeusuarionombreCasoincorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
	public void registrodeusuarionombreCasoincorrecto() {
		// Test name: Registro de usuario nombre(Caso incorrecto)
		// Step # | name | target | value
		// 1 | open | / |
		driver.get("http://gomezmontalban-sesion06.eastus.cloudapp.azure.com/");
		// 2 | setWindowSize | 936x692 |
		driver.manage().window().setSize(new Dimension(936, 692));
		// 3 | executeScript | return "ual-" +
		// Math.floor(Math.random()*1500000)+"@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
		// 4 | click | linkText=Sign up |
		driver.findElement(By.linkText("Sign up")).click();
		// 5 | click | id=email-address |
		driver.findElement(By.id("email-address")).click();
		// 6 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 7 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 8 | type | id=confirm-password | nAvXT6vYTnqa22e
		driver.findElement(By.id("confirm-password")).sendKeys("nAvXT6vYTnqa22e");
		// 9 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | nAvXT6vYTnqa22e
		driver.findElement(By.id("password")).sendKeys("nAvXT6vYTnqa22e");
		// 11 | click | id=confirm-password |
		driver.findElement(By.id("confirm-password")).click();
		// 12 | click | css=.container-fluid |
		driver.findElement(By.cssSelector(".container-fluid")).click();
		// 13 | click | id=terms-agreement |
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 15 | executeScript | return document.getElementById("name-error").textContent
		// | message

		assertEquals(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), "Please enter your full name.");

	}
}
