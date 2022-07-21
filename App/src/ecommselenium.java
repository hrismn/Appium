import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;

public class ecommselenium extends Base2 {

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

  //Tap
  
   WebElement checkbox = driver.findElementByClassName("android.widget.CheckBox");
  TouchAction t = new TouchAction(driver);
  t.tap(tapOptions().withElement(element(checkbox))).perform();
  
  //Longpress
  
  driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
  
  Thread.sleep(7000);
   Set<String> contexts = driver.getContextHandles();

   for(String contextname: contexts)
   {
	   System.out.println(contextname);
   }
   
  driver.context("WEBVIEW_com.androidsample.generalstore");

   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Harish");
   driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
   driver.navigate().back();


   
	}
	
	


}


