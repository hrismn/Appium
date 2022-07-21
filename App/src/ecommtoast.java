import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommtoast extends Base2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		String toastMessage=driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");

		System.out.println(toastMessage);
		
		Assert.assertEquals("Please enter your name", toastMessage);
	}

}
