package itemtotal

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TaxAmount {

	@Keyword
	public static float itemTotalTax() {
		String tax = WebUI.getText(findTestObject('Page_Swag Labs/Confirmation/taxAmount'))
		String [] totalTax = tax.split(":")
		String totalTaxAmount = totalTax[1].trim().replaceAll("[^.\\d]","")
		float taxOnItems= Float.parseFloat(totalTaxAmount)
		System.out.println(taxOnItems)
		return taxOnItems
	}
	@Keyword
	public static float tax(taxOnItems) {
		System.out.println(taxOnItems)
	}
	
}
