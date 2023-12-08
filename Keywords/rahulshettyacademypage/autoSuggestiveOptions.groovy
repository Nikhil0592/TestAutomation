package rahulshettyacademypage

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class autoSuggestiveOptions {

	@Keyword
	public void radioBtn(String inputText, String countryDisplayed) {
		WebUI.setText(findTestObject('Object Repository/Page_Practice Page/inputautocomplete'), inputText)

		WebUI.delay(3)

		List<WebElement> elements = WebUI.findWebElements(findTestObject('Object Repository/Page_Practice Page/autosuggestiveoptions'),
				10)

		for (WebElement element : elements) {
			if (element.getText().equalsIgnoreCase(countryDisplayed)) {
				element.click()

				break
			}
		}
	}
}