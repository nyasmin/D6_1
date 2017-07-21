import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SdetTraining_TestCases {
	
	private WebDriver driver;
	private String baseUrl;
	
	//login testcase
	@Ignore
	@Test
	public void tc_createAccount() throws InterruptedException{
		
		//1. Open browser(Which browser?) and navigate to the AUT
		//driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Huser\\Desktop\\AllJars\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Huser\\Desktop\\AllJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"C:\\Users\\Huser\\Desktop\\AllJars\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
		
		baseUrl = "http://sdettraining.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//2. Click on login Button on the top Right hand
		//3. Click on create account button
		//4. Enter the register form details
		//5. Select gender
		
		driver.get(baseUrl + "/trguitransactions/default.aspx?id=new");
		Thread.sleep(3000);
	    driver.findElement(By.id("HeadLoginView_lblLoginStatus")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("createaccount")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("MainContent_txtFirstName")).clear();
	    driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("SDET");
	    driver.findElement(By.id("MainContent_txtLastName")).clear();
	    driver.findElement(By.id("MainContent_txtLastName")).sendKeys("Student");
	    driver.findElement(By.id("MainContent_Female")).click();
	    driver.findElement(By.id("MainContent_txtEmail")).clear();
	    driver.findElement(By.id("MainContent_txtEmail")).sendKeys("sdet@sdettraining.com");
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).clear();
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtHomePhone")).clear();
	    driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("6825586752");
	    driver.findElement(By.id("MainContent_txtCellPhone")).clear();
	    driver.findElement(By.id("MainContent_txtCellPhone")).sendKeys("6825586752");
	    driver.findElement(By.id("MainContent_txtInstructions")).clear();
	    driver.findElement(By.id("MainContent_txtInstructions")).sendKeys("Selenium IDE Test");
	    driver.findElement(By.id("MainContent_btnSubmit")).click();
	    Thread.sleep(3000);
	   // Assert.assertEquals("Customer information added successfully", actual);
		
	}
	
	@Ignore
	@Test
	public void tc_Login() throws InterruptedException{
		
		//1. Open browser(Which browser?) and navigate to the AUT
		//driver = new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Huser\\Desktop\\AllJars\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Huser\\Desktop\\AllJars\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		baseUrl = "http://sdettraining.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/trguitransactions/default.aspx?id=new");
		Thread.sleep(3000);
	    driver.findElement(By.id("HeadLoginView_lblLoginStatus")).click();
	    driver.findElement(By.id("MainContent_txtUserName")).clear();
	    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet@sdettraining.com");
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
	    Thread.sleep(3000);
	    driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	@Test
	public void tc_Login_WD() throws InterruptedException{
		
		//1. Open browser(Which browser?) and navigate to the AUT
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Huser\\Desktop\\AllJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl = "http://sdettraining.com/trguitransactions/default.aspx?id=new";
		driver.get(baseUrl);
		driver.findElement(By.id("HeadLoginView_lblLoginStatus")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='MainContent_txtUserName']")).sendKeys("sdet@sdettraining.com");
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("Password");
		Thread.sleep(3000);
		driver.findElement(By.id("MainContent_btnLogin")).click();
		String vExpected = "Welcome back!";
		String vActual = driver.findElement(By.xpath("//*[@id='MainContent_lblid']/h1")).getText();
		System.out.println("Value read is "+vActual);
		Assert.assertEquals(vExpected, vActual);
		if(vExpected.equals(vActual)){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
		
	}
	
	
	
}
