package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
//public ChromeDriver driver;
// @Given("Launch the browser")
// public void launchBrowser(){
//	 WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//}
// @Given("Load the url")
// public void loadUrl() {
//	 driver.get("http://leaftaps.com/opentaps/");
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
// }
	@Given("Enter the username as {string}")
	public void username(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("Enter the password as {string}")
	public void password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the login page")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void homePage() {
		boolean link = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (link == true) {
			System.out.println("Login is Successful");
		} else {
			System.out.println("Login is Unsuccessful");
		}
	}


	
}
