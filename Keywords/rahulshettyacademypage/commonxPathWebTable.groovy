package rahulshettyacademypage

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI













public class commonxPathWebTable {
	WebDriver driver = DriverFactory.getWebDriver()

	@Keyword
	public void commonLocator(WebDriver driver, String name) {
		WebElement element= driver.findElement(By.xpath("//*[contains(text(),'"+name+"')]"))
		WebUI.delay(2)
		System.out.println(element.getText())
	}
}
