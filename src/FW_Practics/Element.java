package FW_Practics;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebElement;

public class Element {
	
	private WebElement webElement;
	private String elementName;
	
	public void click()
	{
		System.out.println("Clicked");
	}

	public void typeValue(String str)
	{
		System.out.println("typed " + str);
	}
}
