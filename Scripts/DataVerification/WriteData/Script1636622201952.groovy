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
//import org.apache.poi.ss.usermodel.Workbook
//import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.usermodel.*
import org.openqa.selenium.Keys as Keys
import java.io.FileInputStream as FileInputStream

WebUI.openBrowser('')

WebUI.navigateToUrl('https://meesho.com/')

WebUI.click(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/span_Women Western'))

WebUI.click(findTestObject('Object Repository/Task/Page_Meesho Online Shopping-Lowest Prices,G_91e2c8/p_Dresses'))

WebUI.click(findTestObject('Object Repository/Task/Page_Women Dresses  Latest Dress Designs at_6bff0c/img_Free Delivery_NewProductCard__ImageStyl_bd560a'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/span_M'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/span_Trendy Partywear Women Dresses'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/span_Trendy Partywear Women Dresses'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/span_Trendy Partywear Women Dresses'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/span_Trendy Partywear Women Dresses'))

WebUI.click(findTestObject('Object Repository/Task/Page_Trendy Partywear Women Dresses/button_Add To Cart'))

def WriteInExcel(def data) {
    FileInputStream fis = new FileInputStream('C:\\Users\\Dell\\Desktop\\data.xlsx')

    Workbook wb = WorkbookFactory.create(fis)

    Sheet s = wb.getSheet('Sheet1')

    Row r = s.createRow(2)

    Cell c = r.createCell(2)

    c.setCellValue(data)

    FileOutputStream fout = new FileOutputStream('C:\\Users\\Dell\\Desktop\\data.xlsx')

    wb.write(fout)
}

