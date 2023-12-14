import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webTables.keyword.webTableComparison as webTableComparison
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.geeksforgeeks.org/compare-and-find-differences-between-two-tables-in-sql/')

WebDriver driver = DriverFactory.getWebDriver()

WebElement tableElement1 = driver.findElement(By.xpath('//*[@id="post-593260"]/div[4]/figure[1]/table'))

WebElement tableElement2 = driver.findElement(By.xpath('//*[@id="post-593260"]/div[4]/figure[2]/table'))

Map<String, Map> actMap = CustomKeywords.'webTables.webTableComparison.getExcelAsMap'(tableElement1, '')

Map<String, Map> expMap = CustomKeywords.'webTables.webTableComparison.getExcelAsMap'(tableElement2, '')

System.out.println('Actual Maps :' + actMap)

System.out.println('ExpMap Maps :' + expMap)

CustomKeywords.'webTables.webTableComparison.compareActExpMap'(a, [('key1') : 'value1'], [:], null)

