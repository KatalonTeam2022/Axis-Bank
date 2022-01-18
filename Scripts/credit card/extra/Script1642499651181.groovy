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

WebUI.navigateToUrl('https://www.axisbank.com/')

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/svg'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/a_login'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/h4_Cards'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/a_Credit Card'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/a_Yes'))

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank/input_PAN_mobileinfo_Pan'), 'dxvpm3172g')

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/button_Next'))

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank/input_PAN_mobileinfo_Pan'), 'dxvpm3172g')

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/button_Next'))

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Axis Bank Credit Card/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank Credit Card/button_Ok'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.axisbank.com/')

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/span_X'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/svg'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/h4_Cards'))

WebUI.click(findTestObject('Object Repository/Page_Personal Banking  Internet Banking  Co_3e2a1a/a_Credit Card_1'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank/a_No'))

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank Credit Card/input_Mobile Number_cust_MOB'), '7276470085')

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank Credit Card/input_PAN Number_cust_PAN'), 'dxvpm3172g')

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank Credit Card/input_Pincode_cust_PINCODE'), '421501')

WebUI.setText(findTestObject('Object Repository/Page_Axis Bank Credit Card/input_Net Annual Income()_cust_NETINCOME'), '0')

WebUI.click(findTestObject('Object Repository/Page_Axis Bank Credit Card/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Axis Bank Credit Card/button_Ok'))

