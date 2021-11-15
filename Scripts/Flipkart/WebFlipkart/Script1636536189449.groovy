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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.setText(findTestObject('Object Repository/Task/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Get access to your Orders, Wishlist a_a7d639'), 
    '9164991755')

WebUI.setEncryptedText(findTestObject('Object Repository/Task/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Enter EmailMobile number__2IX_2- _3mc_bfbf75'), 
    'jI2sTdxjhXCf9oGo4hJjKA==')

WebUI.click(findTestObject('Object Repository/Task/Page_Online Shopping Site for Mobiles, Elec_b3f752/span_Login'))

WebUI.setText(findTestObject('Object Repository/Task/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Plus_q'), 
    'realme mobile')

WebUI.click(findTestObject('Object Repository/Task/Page_Online Shopping Site for Mobiles, Elec_b3f752/svg'))

WebUI.click(findTestObject('Object Repository/Task/Page_Realme Mobile- Buy Products Online at _853a52/div_realme C21 (Cross Blue, 64 GB)'))

WebUI.switchToWindowTitle('realme C21 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com')

WebUI.click(findTestObject('Object Repository/Task/Page_realme C21 ( 64 GB Storage, 4 GB RAM )_9d5f7a/button_GO TO CART'))

WebUI.closeBrowser()

