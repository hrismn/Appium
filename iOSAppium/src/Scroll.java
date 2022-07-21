import java.net.MalformedURLException;
import java.util.HashMap;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Scroll extends BaseIOSTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		IOSDriver driver =	DesiredCapabilities();
		
		HashMap<String,Object>scrollobject = new HashMap<>();
		scrollobject.put("direction","down");
		scrollobject.put("name","Web View");
		
		
		driver.executeScript("mobile:scroll", scrollobject);
		
		driver.findElementByAccessibilityId("Web View").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]").click();
	
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("228");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("110s");
	System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());

	driver.findElementByXPath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]").click();
	driver.findElementByAccessibilityId("Sliders").click();
	IOSElement slider=(IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider");
	 
	Thread.sleep(2000);
	 
	slider.setValue("0%");
	 
	System.out.println(slider.getAttribute("value"));
	 
	Thread.sleep(2000);
	 
	slider.setValue("1%");//0 .90 1
	 
	Thread.sleep(2000);
	 
	System.out.println(slider.getAttribute("value"));
	
	
  


	
	
	
	}

}
