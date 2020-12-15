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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Procurement Active1/Page_diagnostics/input_Company_Name'), 'Intro Company')

WebUI.setText(findTestObject('Procurement Active1/Page_diagnostics/input_Person-in-charge'), 'Admin')

WebUI.setText(findTestObject('Procurement Active1/Page_diagnostics/input_Notification_email'), 'adminn@test.com')

WebUI.setText(findTestObject('Procurement Active1/Page_diagnostics/input_Contact_number'), '1234567890')

WebUI.click(findTestObject('Procurement Active1/Page_diagnostics/label_SELECT ADDRESS'))

WebUI.click(findTestObject('Item Details/Page_diagnostics/a_Accept Cookies'))

WebUI.click(findTestObject('Procurement Active1/Page_diagnostics/a_NEXT'))

