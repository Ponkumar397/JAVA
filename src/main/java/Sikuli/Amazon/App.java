package Sikuli.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Screen s= new Screen();
		Pattern first =new Pattern("C:\\Images\\amazon.PNG");
		Pattern second =new Pattern("C:\\Images\\amzsearch.PNG");
		try {
			s.wait(first,5000);
			s.type(first,"tshirts");
			s.click(second);
		
	
			
	
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
