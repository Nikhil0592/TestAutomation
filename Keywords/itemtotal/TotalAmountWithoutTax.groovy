package itemtotal
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI








class TotalAmountWithoutTax {

	@Keyword
	public void itemTotalWithoutTax() {
		String itemTotal = WebUI.getText(findTestObject('Page_Swag Labs/Confirmation/itemTotal'))
		String [] total = itemTotal.split(":")
		String totalWithoutTax = total[1].trim().replaceAll("[^.\\d]","")
		float itemTotalWithoutTax = Float.parseFloat(totalWithoutTax)
		System.out.println(itemTotalWithoutTax)
	}
}