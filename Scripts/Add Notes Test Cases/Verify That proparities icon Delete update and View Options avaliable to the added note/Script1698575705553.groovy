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

WebUI.callTestCase(findTestCase('Login Test Cases/Verify successful login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Add Note'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/select_HomeWorkPersonal'), 
    'Work', true)

int RN = ((Math.random() * 10000) as int)

WebUI.setText(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/input_Title_title'), 
    'test data' + RN)

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/div_Add new noteCategoryHomeWorkPersonalCom_d4c68f'))

WebUI.setText(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/textarea_test data'), 
    'test data' + RN)

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Create'))

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Work'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/a_View'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Edit'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Delete'), 
    0)

WebUI.closeBrowser()

