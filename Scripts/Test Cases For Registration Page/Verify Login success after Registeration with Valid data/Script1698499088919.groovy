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

WebUI.navigateToUrl('https://practice.expandtesting.com/notes/app/register')

int RN = ((Math.random() * 10000) as int)

WebUI.setText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Email address_email'), 
    ('email' + RN) + '@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Password_password'), 
    '5xx1bkCcAlw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Confirm Password_confirmPassword'), 
    '5xx1bkCcAlw=')

WebUI.setText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Name_name'), 
    'test' + RN)

WebUI.click(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/button_Register'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/b_User account created successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/a_Click here to Log In'))

WebUI.navigateToUrl('https://practice.expandtesting.com/notes/app/login')

WebUI.setText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Email address_email'), 
    ('email' + RN) + '@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Password_password'), 
    '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/a_MyNotes'), 
    0)

WebUI.closeBrowser()

