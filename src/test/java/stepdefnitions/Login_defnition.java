package stepdefnitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_defnition {
	static WebDriver driver;

	@Given("User is able to open facebook")
	public void user_is_able_to_open_facebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@When("User is able to send the password")
	public void user_is_able_to_send_the_password() {
		System.out.println("Hero1");

	}

	@When("click on login")
	public void click_on_login() {

	}

}
//C:\Users\Administrator\Desktop\Cdriver\chromedriver-win32\chromedriver-win32\chromedriver-win32