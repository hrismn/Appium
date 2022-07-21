import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommoptimize extends Base2 {

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
        driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(0).click();
        driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(1).click();
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
        Thread.sleep(4000);
        
        int count = driver.findElementsById("com.androidsample.generalstore:id/productPrice").size();
        double sum=0;
        for (int i=0;i<count;i++)
        {
        	String amount1= driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(i).getText();
        	double amount=getAmount(amount1);
        	sum=sum+amount;
        }
  
        System.out.println(sum+" Sum of products");
     
  String total = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
  double totalvalue =  getAmount(total);
  
  System.out.println(totalvalue+ " Total of products");
  
  Assert.assertEquals(sum, totalvalue);
	}
	
	
  public static double getAmount(String Value)	
  
  {
	   Value = Value.substring(1);
	   double amount2value = Double.parseDouble(Value);
	   return amount2value;
  }
  
  

}


