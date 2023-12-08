import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rahulshettyacademy.com/AutomationPractice/')

WebUI.click(findTestObject('Object Repository/Page_Practice Page/input_radioButton'))

WebUI.setText(findTestObject('Object Repository/Page_Practice Page/inputautocomplete'), 'ame')

WebUI.delay(3)

List<WebElement> elements = WebUI.findWebElements(findTestObject('Object Repository/Page_Practice Page/autosuggestiveoptions'), 
    20)

for (WebElement element : elements) {
    if (element.getText().equalsIgnoreCase('Cameroon')) {
        element.click()

        break
    }
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Practice Page/select_Select                     Option1  _bf898a'), 
    'option2', true)

WebUI.click(findTestObject('Object Repository/Page_Practice Page/input_checkBoxOption3'))

WebUI.click(findTestObject('Object Repository/Page_Practice Page/button_Open Window'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_QAClick Academy - A Testing Academy to_2095f2/a_Learn More'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowTitle('Practice Page')

WebUI.setText(findTestObject('Object Repository/Page_Practice Page/input_enter-name'), 'Nikhil')

WebUI.click(findTestObject('Object Repository/Page_Practice Page/inputalertbtn'))

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

System.out.println(AlertText)

WebUI.acceptAlert()

System.out.println(WebUI.getText(findTestObject('Object Repository/Page_Practice Page/td_WebSecurity Testing for Beginners-QA kno_13c7b8')))

JavascriptExecutor js = (JavascriptExecutor)driver

WebElement tableScroll = driver.findElement(By.xpath('//table[@id=\'product\']/tbody/tr[9]/td[4]'))

js.executeScript('arguments[0].scrollIntoView();', tableScroll)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Practice Page/a_VIEW ALL COURSES'))

WebUI.mouseOver(findTestObject('Page_Practice Page/mousehover'))

WebUI.click(findTestObject('Page_Practice Page/a_Top'))

