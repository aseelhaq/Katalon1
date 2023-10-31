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

WebUI.callTestCase(findTestCase('Add Notes Test Cases/Verify Add Notes to Home Category'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Edit'))

int RN = ((Math.random() * 10000) as int)
WebUI.setText(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/textarea_test data483'), 
    'test data'+RN)

WebUI.setText(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/textarea_test data4831'), 
    'test data'+RN)

WebUI.selectOptionByValue(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/select_HomeWorkPersonal'), 
    'Work', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/select_HomeWorkPersonal'), 
    'Personal', true)

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Save'))

WebUI.click(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Personal'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notes_Page/Page_Test Automation Practice Working with _91906a/button_Edit'), 
    0)

WebUI.closeBrowser()

