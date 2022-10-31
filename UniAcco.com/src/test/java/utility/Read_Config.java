package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config {
Properties pro;
	
	public Read_Config() {
		File file = new File("./Configurations\\config.properties");
		
		try {
			FileInputStream abc = new FileInputStream(file);
			pro = new Properties();
			pro.load(abc);
		}
		catch(Exception e) {
			System.out.println("Exception is " +e.getMessage());
		}
		
	}
	
	public String getURL() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getFullName() {
		String fullname = pro.getProperty("full_name");
		return fullname;
	}
	
	public String getEmail() {
		String email = pro.getProperty("email");
		return email;
	}
	
	public String getPhone() {
		String phone = pro.getProperty("phone");
		return phone;
	}
	
	public String getMessage() {
		String message = pro.getProperty("message");
		return message;
	}

}
