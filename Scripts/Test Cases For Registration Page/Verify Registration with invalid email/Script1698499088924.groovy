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

WebUI.setText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Email address_email'), 
    'user')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Password_password'), 
    '5xx1bkCcAlw=')

WebUI.setText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Name_name'), 
    'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/input_Confirm Password_confirmPassword'), 
    '5xx1bkCcAlw=')

WebUI.click(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/button_Register'))

WebUI.click(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/div_Email address is invalid'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/div_Email address is invalid'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Registration_Page/Page_Test Automation Practice Working with _91906a/div_Email address is invalid'), 
    'Email address is invalid')

WebUI.closeBrowser()

