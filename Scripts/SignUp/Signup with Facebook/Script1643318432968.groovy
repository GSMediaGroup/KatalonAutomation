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

WebUI.setViewPortSize(1200, 1000)

WebUI.navigateToUrl('https://dev.adroot.io/auth/signin')

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Login/a_Sign up now'))

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/button_Sign up'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_Facebook/input_Email or phone_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_Facebook/input_Password_pass'), '/cmVevPZqxso+uthIH5BoA==')

WebUI.click(findTestObject('SignUp/Page_Facebook/Page_Facebook/label_Password_loginbutton'))

WebUI.switchToWindowTitle('AdRoot ‒ Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/SignUp/Page_AdRoot  Dashboard/a_Campaigns'), 0)

WebUI.closeBrowser()

