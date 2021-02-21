package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
	      Properties prop = null;
	      fis = new FileInputStream("test.properties1.txt");
	         prop = new Properties();
	         prop.load(fis);
	         System.out.println("username: "+ prop.getProperty("username"));
	         prop.setProperty("username", "admin");
	         System.out.println("password: "+ prop.getProperty("password"));
	         prop.setProperty("place","pune");
	         System.out.println("place: "+ prop.getProperty("place"));

	}

}
