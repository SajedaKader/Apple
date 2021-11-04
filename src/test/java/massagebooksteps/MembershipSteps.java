package massagebooksteps;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massagebookbase.MassageBookBase;

public class MembershipSteps extends MassageBookBase{
	
	ExtentReports extent = new ExtentReports();
    ExtentTest test = extent.createTest("Membership Test");
    
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/MembershipReport.html");
    		
    
	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		extent.attachReporter(spark);
		getChromeDriver2();
		test.pass("The Test Started Successfully!");
		test.pass("Browser session Started!");
	}

	@When("user is able to enter username")
	public void user_is_able_to_enter_username() {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sajeda@2book.com");
	   test.pass("User Able to enter Username!");
	}

	@When("user is able to enter password")
	public void user_is_able_to_enter_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Lockdown2021!");
		test.pass("User Successfully enters password!");
	}

	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() {
		driver.findElement(By.xpath("//input[@id='submitlogin']")).click();
		test.pass("User clicks on sign In!");
	}

	@When("user clicks on Setup")
	public void user_clicks_on_setup() {
		driver.findElement(By.xpath("//*[@id=\"app-nav-business\"]/ul/li[2]/div[1]")).click();
		test.pass("User clicks on setup!");
	}

	@When("user selects service menu")
	public void user_selects_service_menu() {
		driver.findElement(By.xpath("//span[contains(text(),'Service Menu')]")).click();
		test.pass("User selects service menu!");
	}

	@When("user clicks on memberships")
	public void user_clicks_on_memberships() {
		driver.findElement(By.xpath("//span[contains(text(),'Memberships')]")).click();
		test.pass("User clicks on memberships!");
	}

	@When("user clicks on add new membership")
	public void user_clicks_on_add_new_membership() {
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		test.pass("User clicks on add new membership!");
	}

	@When("user enters a membership name")
	public void user_enters_a_membership_name() {
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("bodymassage300");
		test.pass("User enters a membership name!");
	}

	@When("user enters description")
	public void user_enters_description() {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("body massage test300");
		test.pass("User enters description!");
	}

	@When("user enters price")
	public void user_enters_price() {
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("300");
		test.pass("User enters price!");
	}

	@When("user clicks allow unused sessions")
	public void user_clicks_allow_unused_sessions() {
		driver.findElement(By.xpath("//label[@for='carryover']")).click();
		test.pass("User clicks allow unused sessions!");
	}

	@When("user selects months before expiring")
	public void user_selects_months_before_expiring() {
		Select expiry = new Select(driver.findElement(By.xpath("//select[@name='carryover-duration']")));
		
        expiry.selectByVisibleText("6");
        test.pass("User selects months before expiring!");
	}

	@When("user enters number of services included")
	public void user_enters_number_of_services_included() {
		driver.findElement(By.xpath("//input[@name='quantity_0']")).sendKeys("3");
		test.pass("User enters number of services included!");
	}

	@When("user clicks on select services")
	public void user_clicks_on_select_services() {
		driver.findElement(By.xpath("//button[contains(text(),'Select service(s)')]")).click();
		test.pass("User clicks on select services!");
		}

	@When("user clicks on select All")
	public void user_clicks_on_select_all() {
		driver.findElement(By.xpath("//label[@class='service__list-item mb-checkbox mb-checkbox--primary']")).click();
		test.pass("User clicks on select All!");
	}

	@When("user clicks on select")
	public void user_clicks_on_select() {
		driver.findElement(By.xpath("//html/body/div[2]/div[6]/div[2]/div[1]/div/div/footer/button[2]")).click();
		test.pass("User clicks on select!");
	}

	@Then("user clicks on save")
	public void user_clicks_on_save() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg mr-3']")).click();
		test.pass("User Successfully created a Membership!");
		extent.flush();
		driver.quit();
		driver.close();
		test.pass("Browser session closed!");

	}

}
