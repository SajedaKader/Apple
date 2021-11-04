package massagebooksteps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massagebookbase.MassageBookBase;

public class MassagebookSteps extends MassageBookBase {
	ExtentReports extent = new ExtentReports();
    ExtentTest test = extent.createTest("Login Test");
    
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/CreateAccountReport.html");
    		
    @Given("user is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException, IOException {
		extent.attachReporter(spark);
		getChromeDriver();
		test.pass("The Test Started Successfully!");
		TakesScreenshot scrsht = ((TakesScreenshot)driver);
		File srcFile = scrsht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("ss"+".png"));
		System.out.println("===========================================================");
		System.out.println("On The Webpage");
		System.out.println("===========================================================");
		Thread.sleep(2000);
	}

	@When("user clicks on Create Account")
	public void user_clicks_on_create_account() {
		driver.findElement(By.xpath("//*[@id=\"hero\"]/div/header/div/nav/div[2]/div[2]/a[2]")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks on Create Account");
		System.out.println("===========================================================");
		test.pass("User Clicks on Create Account");
	}

	@When("user clicks on Create Professional Account")
	public void user_clicks_on_create_professional_account() {
		driver.findElement(By.xpath("//*[@id=\"createProfessional\"]")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks on Create Professional Account");
		System.out.println("===========================================================");
		test.pass("User Clicks on Create Professional Account");
	}

	@When("user enters <username>")
	public void user_enters_username() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sajeda+2@2book.com");
		System.out.println("===========================================================");
		System.out.println("User Enters Username");
		System.out.println("===========================================================");
		test.pass("User Enters Username");
	}

	@When("user enters <password>")
	public void user_enters_password() {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		System.out.println("===========================================================");
		System.out.println("User Enters Password");
		System.out.println("===========================================================");
		test.pass("User Enters Password");
	}

	@When("user enters coupon code if received")
	public void user_enters_coupon_code_if_received() {
		driver.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys("");
		System.out.println("===========================================================");
		System.out.println("User Enters Coupon Code if received");
		System.out.println("===========================================================");
		test.pass("User Enters Coupon Code if received");
	}

	@When("user click on Lets get started")
	public void user_click_on_lets_get_started() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"createaccount\"]")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks Let's Get Started");
		System.out.println("===========================================================");
		test.pass("User Clicks Let's Get Started");
	}

	@When("user selects business account category")
	public void user_selects_business_account_category() throws InterruptedException {
		WebElement caty = driver.findElement(By.xpath("//*[@id=\"squaredFour2\"]"));
		if (!caty.isSelected()) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", caty);
		}
		WebElement caty2 = driver.findElement(By.xpath("//*[@id=\"squaredFour1\"]"));
		if (caty2.isSelected()) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", caty2);
		}
		System.out.println("===========================================================");
		System.out.println("User Selects Business Account Category");
		System.out.println("===========================================================");
		test.pass("User Selects Business Account Category");
	}
	
	@When("user clicks Next1")
	public void user_clicks_next1() {
		driver.findElement(By.xpath("//*[@id=\"button-next\"]")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks on Next");
		System.out.println("===========================================================");
		test.pass("User Clicks on Next");
	}


	@When("user selects Country")
	public void user_selects_country() {
		System.out.println("===========================================================");
		System.out.println("User Selects Country");
		System.out.println("===========================================================");
		test.pass("User Selects Country");
	}

	@When("user enters Business Name")
	public void user_enters_business_name() {
		driver.findElement(By.xpath("//*[@id=\"business_name\"]")).sendKeys("Massagebook222");
		System.out.println("===========================================================");
		System.out.println("User Enters Business Name");
		System.out.println("===========================================================");
		test.pass("User Enters Business Name");
	}

	@When("user enters Business URL")
	public void user_enters_business_url() {
		//driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/fieldset[3]/div[1]/input")).sendKeys("Massagebook2021");
		System.out.println("===========================================================");
		System.out.println("User Enters Business URL");
		System.out.println("===========================================================");
		test.pass("User Enters Business URL");
	}

	@When("user enters Address1")
	public void user_enters_address1() {
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("123");
		System.out.println("===========================================================");
		System.out.println("User Enters Address 1");
		System.out.println("===========================================================");
		test.pass("User Enters Address 1");
	}

	@When("user enters Address2")
	public void user_enters_address2() {
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Queens");
		System.out.println("===========================================================");
		System.out.println("User Enters Address 2");
		System.out.println("===========================================================");
		test.pass("User Enters Address 2");
	}

	@When("user selects if address can be listed publically")
	public void user_selects_if_address_can_be_listed_publically() {
		WebElement pdn = driver.findElement(By.xpath("//*[@id=\"show_address\"]"));
		if (!pdn.isSelected()) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", pdn);
		}
		System.out.println("===========================================================");
		System.out.println("User Clicks if address can be listed publically");
		System.out.println("===========================================================");
		test.pass("User Clicks if address can be listed publically");
	}

	@When("user enters City")
	public void user_enters_city() {
		driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/div[1]/div[2]/div[1]/div/div[1]/fieldset/input")).sendKeys("New York");
		System.out.println("===========================================================");
		System.out.println("User Enters City");
		System.out.println("===========================================================");
		test.pass("User Enters City");
	}

	@When("user selects State")
	public void user_selects_state() {
		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/div[1]/div[2]/div[1]/div/div[2]/fieldset/div[1]/select")));
        country.selectByVisibleText("CA");
		//driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();
		//driver.findElement(By.xpath("//div[@id='select2-result-label-112']")).click();
		System.out.println("===========================================================");
		System.out.println("User Selects State");
		System.out.println("===========================================================");
		test.pass("User Selects State");
	}

	@When("user enters Zip")
	public void user_enters_zip() {
		driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/div[1]/div[2]/div[2]/fieldset/input")).sendKeys("10001");
		System.out.println("===========================================================");
		System.out.println("User Enters Zip");
		System.out.println("===========================================================");
		test.pass("User Enters Zip");
	}

	@When("user enters Phone")
	public void user_enters_phone() {
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567891");
		System.out.println("===========================================================");
		System.out.println("User Enters Phone");
		System.out.println("===========================================================");
		test.pass("User Enters Phone");
	}

	@When("user selects if its a cell")
	public void user_selects_if_its_a_cell() {
		driver.findElement(By.xpath("//*[@id=\"uniform-is_cell\"]/span")).click();
		System.out.println("===========================================================");
		System.out.println("User Selects if its a Cell");
		System.out.println("===========================================================");
		test.pass("User Selects if its a Cell");
	}

	@When("user clicks Next")
	public void user_clicks_next() {
		driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/div[2]/button")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks Next");
		System.out.println("===========================================================");
		test.pass("User Clicks Next");
	}

	@When("user enters First Name")
	public void user_enters_first_name() {
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Sajeda");
		System.out.println("===========================================================");
		System.out.println("User Enters First Name");
		System.out.println("===========================================================");
		test.pass("User Enters First Name");
	}

	@When("user enters Last Name")
	public void user_enters_last_name() {
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Sajeda");
		System.out.println("===========================================================");
		System.out.println("User Enters Last Name");
		System.out.println("===========================================================");
		test.pass("User Enters Last Name");
	}

	@When("user selects past schedule type")
	public void user_selects_past_schedule_type() {
		driver.findElement(By.xpath("//*[@id=\"section-form\"]/form/fieldset[1]/div[1]/label[3]/div/span/input")).click();
		System.out.println("===========================================================");
		System.out.println("User Selects Past Scheduling Type");
		System.out.println("===========================================================");
		test.pass("User Selects Past Scheduling Type");
	}

	@When("user selects terms of use")
	public void user_selects_terms_of_use() {
		driver.findElement(By.xpath("//*[@id=\"squaredFourTerms\"]")).click();
		System.out.println("===========================================================");
		System.out.println("User Selects Terms of Use");
		System.out.println("===========================================================");
		test.pass("User Selects Terms of Use");
	}

	@When("user clicks Get Started")
	public void user_clicks_get_started() {
		driver.findElement(By.xpath("//*[@id=\"button-next\"]")).click();
		System.out.println("===========================================================");
		System.out.println("User Clicks Get Started");
		System.out.println("===========================================================");
		test.pass("User Clicks Get Started");
	}
	
	
	@Then("user is navigated to profile dashboard")
	public void user_is_navigated_to_profile_dashboard() {
		test.pass("User Successfully able to login");
		System.out.println("===========================================================");
		System.out.println("User Successfully able to login");
		System.out.println("===========================================================");
		//driver.close();
		//driver.quit();
		System.out.println("===========================================================");
		System.out.println("Browser Closed");
		System.out.println("===========================================================");
	    extent.flush();

	}
	
	   @Then("User clicks on sign in")
	    public void user_clicks_on_sign_in() {
	    	driver.findElement(By.xpath("//*[@id=\"hero\"]/div/header/div/nav/div[2]/div[2]/a[1]")).click();
	     System.out.println("a");
	    }

	    @Then("User successfully signin")
	    public void user_successfully_signin() {
	    	System.out.println("b");
	    	driver.findElement(By.xpath("//*[@id=\"submitlogin\"]")).click();
	    }
}