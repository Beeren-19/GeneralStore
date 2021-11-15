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

Mobile.startApplication('C:\\Users\\Dell\\Downloads\\General-Store (3).apk', true)

Mobile.pressBack()

Mobile.scrollToText('Canada')

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.TextView - Canada'), 0)

Mobile.setText(findTestObject('Object Repository/General Store/android.widget.EditText - Enter name here (6)'), 'beerendra', 
    0)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.RadioButton - Male (1)'), 0)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.Button - Lets  Shop (6)'), 0)

Mobile.scrollToText('Nike SFB Jungle')

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.TextView - ADD TO CART (7)'), 0)

Mobile.scrollToText('Air Jordan 4 Retro')

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/General Store/android.widget.Button - Visit to the website to complete purchase (2)'), 
    0)

Mobile.closeApplication()

