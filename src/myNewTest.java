import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myNewTest extends Parametes {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {


		LoginFuncation(StandardUserName,passWord);

		Thread.sleep(2000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		
		
		LoginFuncation(ProblemUserName,passWord);
	
		Thread.sleep(2000);


	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		
		LoginFuncation(PerformanceUserName,passWord);


		Thread.sleep(2000);


	}

	@AfterTest
	public void myPostTest() {
	}
}
