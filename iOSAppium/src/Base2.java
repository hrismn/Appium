


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base2 {

	public static IOSDriver<WebElement> DesiredCapabilities() throws MalformedURLException 
	{
		
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4"); 
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
capabilities.setCapability(MobileCapabilityType.UDID, "49E6468F-8F8F-470B-BF15-45C04D38BED5");
capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);

capabilities.setCapability("commandTimeouts", "12000");
		
capabilities.setCapability(MobileCapabilityType.APP, "/users/harishmurugan/Desktop/longtap.app");

IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),capabilities);

return driver;

	}

}
