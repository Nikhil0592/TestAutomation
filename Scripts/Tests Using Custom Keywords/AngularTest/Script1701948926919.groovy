import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cricbuzz.com/live-cricket-scorecard/76682/brh-vs-mls-1st-match-big-bash-league-2023-24')
WebUI.delay(8)

List<WebElement> runs = WebUI.findWebElements('RandomTestObjects/Page_Cricket scorecard - Brisbane Heat vs M_1d9d92/runs', 
    3)





