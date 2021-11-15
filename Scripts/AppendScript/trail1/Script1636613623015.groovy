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

Mobile.startApplication('C:\\Users\\Dell\\Downloads\\Meesho_base.apk', true)

Mobile.tap(findTestObject('Object Repository/Task/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Task/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Task/android.widget.TextView - saree'), 0)

Mobile.tap(findTestObject('Object Repository/Task/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Task/android.widget.Button - Add to cart (3)'), 0)

Mobile.closeApplication()

//Mobile.startApplication('C:\\Users\\Dell\\Downloads\\Meesho_base.apk', true)
//
//Mobile.tap(findTestObject('Object Repository/Task/android.view.View (2)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Task/android.widget.ImageView (6)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Task/android.widget.TextView - saree'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Task/android.widget.ImageView (7)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Task/android.widget.Button - Add to cart (3)'), 0)
//
//Mobile.closeApplication()
WebUI.openBrowser('')

WebUI.navigateToUrl('https://meesho.com/')

WebUI.setText(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/input_Download App_Text__StyledText-sc-oo0k_e4aaf8'), 
    'saree')

WebUI.closeBrowser()

