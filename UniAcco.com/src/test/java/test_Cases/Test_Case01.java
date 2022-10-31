package test_Cases;

import org.testng.annotations.Test;

import page_Objects.com.Home_Page;

public class Test_Case01 extends Base_Class {
	
	@Test
	public void Signup() {
		Home_Page home = new Home_Page(driver);
		home.close_Popup();
		home.full_Name(full_name);
		home.email(email);
		home.country_Code();
		home.phone(phone);
		home.message(message);
		home.Submit();
	}
	
	

}
