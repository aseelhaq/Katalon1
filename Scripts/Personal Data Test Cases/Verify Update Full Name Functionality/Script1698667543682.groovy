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
int RN = ((Math.random() * 10000) as int)
WebUI.callTestCase(findTestCase('Login Test Cases/Verify successful login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Profile_Page/Page_Test Automation Practice Working with _91906a/a_Profile'))

WebUI.navigateToUrl('https://practice.expandtesting.com/notes/app/profile')

WebUI.doubleClick(findTestObject('Object Repository/Profile_Page/Page_Test Automation Practice Working with _91906a/input_Full Name_name'))

WebUI.setText(findTestObject('Object Repository/Profile_Page/Page_Test Automation Practice Working with _91906a/input_Full Name_name'), 
    'test user'+RN)

WebUI.click(findTestObject('Object Repository/Profile_Page/Page_Test Automation Practice Working with _91906a/button_Update profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Profile_Page/Page_Test Automation Practice Working with _91906a/div_Profile updated successful'), 
    'Profile updated successful')

WebUI.closeBrowser()

