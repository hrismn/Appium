import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobile extends baseChrome {

public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
AndroidDriver<AndroidElement> driver=capabilities();
driver.get("http://facebook.com");
driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
driver.findElementByName("pass").sendKeys("12345");
driver.findElementByXPath("//button[@value='Log In']").click();
//rahulonlinetutor@gmail.com

}

}

