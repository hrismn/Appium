import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommlongpress extends Base2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();
        driver.findElementById("android:id/text1").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))");
        driver.findElementByXPath("//android.widget.TextView[@text='Albania']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        
     //   driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
       // driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
        driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(0).click();
        driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(1).click();
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        Thread.sleep(4000);
     String amount1 = driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(0).getText();
   
    amount1 = amount1.substring(1);
  double amount1value = Double.parseDouble(amount1);
     String amount2 = driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(1).getText();
     
   amount2 = amount2.substring(1);
  double amount2value = Double.parseDouble(amount2);
    
     
     double sumofproducts =   amount1value+amount2value;
     
     System.out.println(sumofproducts+"Sum of prods");
     
  String total = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
  total = total.substring(1);
  double totalvalue = Double.parseDouble(total);
  
  System.out.println(totalvalue+ "Total of prods");
  
  Assert.assertEquals(sumofproducts, totalvalue);
  
  
  
  //Tap
  
   WebElement checkbox = driver.findElementByClassName("android.widget.CheckBox");
  TouchAction t = new TouchAction(driver);
  t.tap(tapOptions().withElement(element(checkbox))).perform();
  
  //Longpress
  
  WebElement tc = driver.findElementByXPath("//android.widget.TextView[@text='Please read our terms of conditions']");
  t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
	
  
  driver.findElementById("android:id/button1").click();
  driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
	}
	
	


}


