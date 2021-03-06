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

public class RegistrodeusuariocontraseaCasoincorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		/// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
	public void registrodeusuariocontraseaCasoincorrecto() {
		// Test name: Registro de usuario contraseña (Caso incorrecto)
		// Step # | name | target | value
		// 1 | open | / |
		driver.get("http://gomezmontalban-sesion06.eastus.cloudapp.azure.com/");
		// 2 | setWindowSize | 1280x584 |
		driver.manage().window().setSize(new Dimension(1280, 584));
		// 3 | click | linkText=Sign up |
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | type | id=full-name | gmm753
		driver.findElement(By.id("full-name")).sendKeys("gmm753");
		// 5 | type | id=email-address | guillermosysti@gmail.com
		driver.findElement(By.id("email-address")).sendKeys("guillermosysti@gmail.com");
		// 6 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 7 | click | css=.container-fluid |
		driver.findElement(By.cssSelector(".container-fluid")).click();
		// 8 | click | id=terms-agreement |
		driver.findElement(By.id("terms-agreement")).click();
		// 9 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 10 | assertText | css=.form-group:nth-child(3) > .invalid-feedback | Please
		// enter a password.
		assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(3) > .invalid-feedback")).getText(),
				is("Please enter a password."));
	}
}
