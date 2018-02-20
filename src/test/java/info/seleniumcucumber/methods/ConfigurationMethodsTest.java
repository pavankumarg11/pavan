package info.seleniumcucumber.methods;

import java.util.Calendar;

import org.apache.http.ssl.SSLInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import env.DriverUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Calendar.class, ConfigurationMethods.class, DriverUtil.class})
public class ConfigurationMethodsTest {
	
	
	ConfigurationMethods configurationMethods = null;
	
	@Mock
	WebDriver driver;

	@Test (expected = SSLInitializationException.class)
	public void testPrintDesktopConfiguration() {
		
		Mockito.when(DriverUtil.getDefaultDriver()).thenReturn(driver);
		
		configurationMethods = new ConfigurationMethods();
		
		configurationMethods.printDesktopConfiguration();
		Mockito.verify(Calendar.getInstance());
	}

}
