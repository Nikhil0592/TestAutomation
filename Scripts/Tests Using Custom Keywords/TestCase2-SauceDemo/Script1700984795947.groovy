import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static org.assertj.core.api.Assertions.assertThat
import static org.junit.Assert.assertTrue
import java.awt.geom.Arc2D.Double as Double
import org.openqa.selenium.Keys as Keys

CustomKeywords.'loginhelper.setUp.loginSauceDemo'('https://www.saucedemo.com/v1/', 'standard_user', 'qcu24s4901FyWDTwXGr6XA==')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Page_Swag Labs_HomePage/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('Page_Swag Labs/Page_Swag Labs_HomePage/btn_ADD TO CART_SauceLabs BackPack'))

WebUI.click(findTestObject('Page_Swag Labs/Page_Swag Labs_HomePage/btn_ADD TO CART_TestAllThingsTshirt'))

WebUI.click(findTestObject('Page_Swag Labs/Page_Swag Labs_HomePage/navigateToCart'))

System.out.println(WebUI.getText(findTestObject('Page_Swag Labs/Page_Swag Labs_Cart/text_TestAllThingsTshirt')))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/Page_Swag Labs_Cart/text_SauceLabsBagDescription'), 'carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.')

WebUI.click(findTestObject('Page_Swag Labs/Page_Swag Labs_Cart/btnCheckOut'))

WebUI.setText(findTestObject('Page_Swag Labs/CheckOut/firstname'), var_firstname)

WebUI.setText(findTestObject('Page_Swag Labs/CheckOut/lastname'), var_lastname)

WebUI.setText(findTestObject('Page_Swag Labs/CheckOut/zipcode'), var_zipcode)

WebUI.click(findTestObject('Page_Swag Labs/CheckOut/btnContinue'))

CustomKeywords.'itemtotal.TotalAmountWithoutTax.itemTotalWithoutTax'()

CustomKeywords.'itemtotal.TaxAmount.itemTotalTax'()

CustomKeywords.'itemtotal.TotalAmountWithTax.itemTotalWithTax'()

CustomKeywords.'loginhelper.setUp.logOutSauceDemo'()

