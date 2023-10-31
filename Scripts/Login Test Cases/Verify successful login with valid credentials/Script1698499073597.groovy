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

WebUI.navigateToUrl('https://practice.expandtesting.com/notes/app/login')

WebUI.setText(findTestObject('Object Repository/TimeSheet_Login_Page/Page_Test Automation Practice Working with _91906a/input_Email address_email'), 
    'email12@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TimeSheet_Login_Page/Page_Test Automation Practice Working with _91906a/input_Forgot password_password'), 
    '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/TimeSheet_Login_Page/Page_Test Automation Practice Working with _91906a/button_Login'))

WebUI.verifyElementPresent(findTestObject('TimeSheet_Home_Page/Page_Test Automation Practice Working with _91906a/a_MyNotes'), 
    0)

WebUI.verifyElementPresent(findTestObject('TimeSheet_Home_Page/Page_Test Automation Practice Working with _91906a/button_Logout'), 
    0)

