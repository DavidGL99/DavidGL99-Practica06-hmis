
// Generated by Selenium IDE
package org.ual.hmis.gomezMontalban;

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

public class LinkedinDavidTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void linkedindavid() {
		// Test name: linkedin-david
		// Step # | name | target | value
		// 1 | open | / |
		driver.get("http://gomezmontalban.eastus.cloudapp.azure.com/");
		// 2 | setWindowSize | 1000x697 |
		driver.manage().window().setSize(new Dimension(1000, 697));
		// 3 | click | css=#linkedin-david path |
		driver.findElement(By.cssSelector("#linkedin-david path")).click();
	}
}
