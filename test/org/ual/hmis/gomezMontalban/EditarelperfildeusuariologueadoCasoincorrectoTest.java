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

public class EditarelperfildeusuariologueadoCasoincorrectoTest {
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
	public void editarelperfildeusuariologueadoCasoincorrecto() {
		// Test name: Editar el perfil de usuario logueado (Caso incorrecto)
		// Step # | name | target | value
		// 1 | open | /welcome |

		driver.get("http://gomezmontalban-sesion06.eastus.cloudapp.azure.com/");
		// 2 | setWindowSize | 1280x722 |
		driver.manage().window().setSize(new Dimension(1280, 722));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | type | css=.form-group:nth-child(2) > .form-control | nAvXT6vYTnqa22e
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("1234");
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// gmm753@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("david.parador99@gmail.com");
		// 6 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();

		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}

		// 3 | click | id=header-account-menu-link |
		driver.findElement(By.id("header-account-menu-link")).click();

		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
		}

		// 4 | click | linkText=Settings |
		driver.findElement(By.linkText("Settings")).click();
		// 5 | click | linkText=Edit profile |
		driver.findElement(By.linkText("Edit profile")).click();
		// 6 | click | id=email-address |
		driver.findElement(By.id("email-address")).click();
		// 7 | type | id=email-address | ual-110178.ual.es
		driver.findElement(By.id("email-address")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("email-address")).sendKeys(Keys.DELETE);
		// 8 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 9 | executeScript | return
		// document.getElementById("email-address").validationMessage | message
		// 10 | echo | ${message} |
		// 11 | assert | message | Introduzca una direcci??n de correo.
		assertEquals(driver.findElement(By.cssSelector(".invalid-feedback")).getText(),
				"Please enter a valid email address.");

	}
}
