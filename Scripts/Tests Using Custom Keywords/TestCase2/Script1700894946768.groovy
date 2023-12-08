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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/input_user-name'), GlobalVariable.UserName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/input_password'), 
    GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/inputlogin-button'))

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/path'))

WebUI.setText(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/inputfirst-name'), 'Nikhil')

WebUI.setText(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/inputlast-name'), 'Arora')

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/a_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/inputpostal-code'), '22323')

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/input_btn_primary cart_button'))

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag_Labs_Confirmation_Page/Page_Swag Labs/a_Logout'))

WebUI.acceptAlert()

