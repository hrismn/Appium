


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseRunner {

	public static IOSDriver<WebElement> DesiredCapabilities() throws MalformedURLException 
	{
		
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4"); 
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
capabilities.setCapability("commandTimeouts", "12000");
		
capabilities.setCapability(MobileCapabilityType.APP, "/private/var/folders/6m/b2_jwl6j6v3f17hf9x30hg700000gp/X/9738DA6A-2021-5BFA-8A23-F9C95BD140CA/d/Wrapper/Runner.app");

IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),capabilities);

return driver;

	}

}
