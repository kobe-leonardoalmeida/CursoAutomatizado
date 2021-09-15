package br.cursoJava;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("app", "C:\\Apk\\CTAppium_1_2.apk");
	    desiredCapabilities.setCapability("platformName", "android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
	
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     //selecionar formulario
	     
	     
	     MobileElement el1 = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	     el1.click();
	     
	     Thread.sleep(3000);
	     
	     MobileElement el2 = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	     el2.click();
	     

	     
	     List<MobileElement> elementosEncontrados = driver.findElements(By.className("android.widget.TextView"));
	     
	     for(MobileElement elemento : elementosEncontrados) {
	    	 System.out.print(elemento.getText());
	     }
	     
	     //escrever nome
	     
	     //checar nome 
	   
	     driver.quit();
	     
	     
	
	
	}

}
