import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommshopscroll extends Base2 {

	public static void main(String[] args) throws MalformedURLException {
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
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))");
       // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))");
        
        
        int count = driver.findElementsById("com.androidsample.generalstore:id/productName").size();
        
        for(int i=0;i<count;i++)
        	
        {
        	
        String text = driver.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
        
        if (text.equalsIgnoreCase("Jordan 6 Rings"))
        {
        	driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();

        	break;
        	
          }
        }
        
       
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        
        
        String lastpageText =  driver.findElementById("com.androidsample.generalstore:id/productName").getText();
        
     Assert.assertEquals("Jordan 6 Rings", lastpageText);

        
	}

}
