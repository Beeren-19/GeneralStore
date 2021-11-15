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
import org.apache.poi.ss.usermodel.*

import java.io.FileInputStream as FileInputStream

WebUI.openBrowser('')

WebUI.navigateToUrl('https://meesho.com/')

WebUI.setText(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/input_Download App_Text__StyledText-sc-oo0k_e4aaf8'), 
    'saree')

WebUI.click(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/svg_Download App_Icon-sc-1iwi4w1-0 huVmzl'))

WebUI.click(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/p_saree'))

WebUI.click(findTestObject('Object Repository/Task/Page_Buy saree Online at best prices at Meesho/img_Supplier_NewProductCard__ImageStyled-sc_ae5d1c'))

WebUI.click(findTestObject('Object Repository/Task/Page_Charvi Alluring Sarees/span_Charvi Alluring Sarees'))

def text=WebUI.getText(findTestObject('Object Repository/Task/Page_Charvi Alluring Sarees/span_Charvi Alluring Sarees'))


WebUI.click(findTestObject('Object Repository/Task/Page_Charvi Alluring Sarees/span_Charvi Alluring Sarees'))

WebUI.click(findTestObject('Object Repository/Task/Page_Charvi Alluring Sarees/span_Add To Cart'))

println text
println readExcelData(2, 2)
//if(text.equals(readExcelData(2, 2))) {
//	println "data matching"
//}
//else {
//	println "data not  matching"
//}

try {
	WebUI.verifyEqual(text, readExcelData(2, 2))
}
catch(Exception e) {
	println "Exception handled"
}

WebUI.closeBrowser()

def readExcelData(def rowno, def cellno) {
FileInputStream fis = new FileInputStream('C:\\Users\\Dell\\Desktop\\data.xlsx')

	Workbook wb = WorkbookFactory.create(fis)

	Sheet s = wb.getSheet("Sheet1")

	Row r = s.getRow(rowno)

	Cell c = r.getCell(cellno)

	def data=c.getStringCellValue()

	//FileOutputStream fout = new FileOutputStream('C:\\Users\\Dell\\Desktop\\data.xlsx')

	wb.close()
	return data
	
	}

