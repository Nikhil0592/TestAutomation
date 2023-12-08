import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rahulshettyacademy.com/AutomationPractice/')

WebUI.click(findTestObject('Object Repository/Page_Practice Page/input_radioButton'))

WebDriver driver = DriverFactory.getWebDriver()

CustomKeywords.'rahulshettyacademypage.autoSuggestiveOptions.radioBtn'('ame', 'Cameroon')

CustomKeywords.'rahulshettyacademypage.commonxPathWebTable.commonLocator'(driver, 'Write effective')

