import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobbrowse extends Basemobchrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElementByCssSelector(".navbar-toggler-icon").click();
		driver.findElementByCssSelector(".nav-link[routerlink='/products']").click();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        
   String text = driver.findElementByCssSelector("body > app-root:nth-child(1) > app-product-details:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > div:nth-child(3) > li:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)").getText();
        Assert.assertEquals(text, "Devops");
        
	}

}
