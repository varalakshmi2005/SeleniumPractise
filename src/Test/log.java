package Test;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class log {
	

	private static	Logger logger=Logger.getLogger(log.class.getName());
	public static void configure()
	{
	 	
		
	  PropertyConfigurator.configure("log4j.properties.txt");
BasicConfigurator.configure();
}

	public static void info(String message){
		
		logger.info(message);
	}
	
	public static void warn(String message)
	{
		//logger.wait(message);
		logger.warn(message);
	}
	
	
	@Test
	public void function()
	{
		log.configure();
		 log.info("This is information.");
		 log.warn("This is warning");
		 
	}

}
