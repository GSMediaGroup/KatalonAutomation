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

WebUI.navigateToUrl('https://dev.adroot.io/auth/signin')

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Login/a_Sign up now'))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_First name_first_name'), 'Runa')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Last name_last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input'), '+37477197878')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Password_password'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Confirm password_confirm'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('SignUp/Page_AdRoot  Sign up/Page_AdRoot  Sign up/div_Confirm password_checkbox'))

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/button_Sign up'))

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/span_Invalid e-mail address'))

WebUI.verifyTextPresent('Invalid e-mail address.', false)

WebUI.closeBrowser()

