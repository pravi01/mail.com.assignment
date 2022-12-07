import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.ls.LSOutput;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.timeout.TimeoutException;


public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/prudh/eclipse-workspace/chromedriver.exe");
	     WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // object of chromedriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();
		driver.get("https://www.mail.com/");
		int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(1);
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	    driver.findElement(By.id("login-button")).click();
	    driver.findElement(By.id("login-email")).sendKeys("int_01@mail.com");
	    driver.findElement(By.id("login-password")).sendKeys("3457576545635345");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.switchTo().frame(3);
	     driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div[1]/ul/li[33]/a")).click();
		    driver.switchTo().defaultContent();
	     WebElement framename = driver.findElement(By.id("thirdPartyFrame_ciss"));
	    driver.switchTo().frame(framename);
	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(200));
	    try {
	           wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Personal Data"))).click();
	    } catch (TimeoutException exception) {
	        System.out.println(exception.getCause().toString());
	    }
	   driver.findElement(By.xpath("//div[@class='links-menu__link-content']")).click();
	   WebElement firstname=driver.findElement(By.xpath("//input[@name='firstNamePanel:topWrapper:inputWrapper:input']"));
	   firstname.clear();
	   firstname.sendKeys("prudhwica");
	   WebElement Lastname=driver.findElement(By.xpath("//input[@name='lastNamePanel:topWrapper:inputWrapper:input']"));
	   Lastname.clear();
	   Lastname.sendKeys("task");
	   WebElement Password=driver.findElement(By.xpath("//input[@name='passwordPanel:topWrapper:inputWrapper:input']"));
	   Password.sendKeys("3457576545635345");
	   driver.findElement(By.xpath("//button[@id='id9']")).click();
	  String name= driver.findElement(By.xpath("//div[@class='links-menu__link-body']/div/div/span[1]")).getText();
	  String lastnames=driver.findElement(By.xpath("//div[@class='links-menu__link-body']/div/div/span[2]")).getText();
	  System.out.println(name + "," + lastnames);
	   
	    }
	}


	   
	    
   
	   


