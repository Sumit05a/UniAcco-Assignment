package page_Objects.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {
	
	@FindBy (xpath = "//span[@aria-hidden=\"true\"]") private WebElement Close;
	@FindBy (xpath = "//input[@placeholder='Full Name']") private WebElement FullName;
	@FindBy (xpath ="//input[@placeholder='Email']") private WebElement Email;
	@FindBy (xpath ="//select[@class='p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']") private WebElement CountryCode;
	@FindBy (xpath = "//input[@placeholder='Phone']") private WebElement Phone;
	@FindBy (xpath = "//textarea[@placeholder='Message']") private WebElement Message;
	@FindBy (xpath = "//button[text()='Submit']") private WebElement Submit;
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void close_Popup() {
		Close.click();
	}
	
	public void full_Name(String fullname) {
		FullName.sendKeys(fullname);
	}
	
	public void email(String email) {
		Email.sendKeys(email);
	}
	
	public void country_Code() {
		CountryCode.click();
		Select select = new Select(CountryCode);
		select.selectByVisibleText("India (+91)");
	}
	
	public void phone(String phone) {
		Phone.sendKeys(phone);
	}
	
	public void message(String message) {
		Message.sendKeys(message);
	}
	
	public void Submit() {
		Submit.click();
	}

}
