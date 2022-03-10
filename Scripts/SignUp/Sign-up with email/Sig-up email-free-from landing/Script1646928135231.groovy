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

WebUI.setViewPortSize(1700, 900)

WebUI.navigateToUrl('http://adroot.io/')

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot Ad Manager - One Place To Manag_7de57e/button_AGREE'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot Ad Manager - One Place To Manag_7de57e/a_Pricing'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_Pricing - AdRoot Ad Manager/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_First name_first_name'), 'Ruzan')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Last name_last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_E-mail_email'), 'runayan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Password_password'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_Confirm password_confirm'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/div_Confirm password_checkbox'))

WebUI.click(findTestObject('SignUp/SignUp with email/Page_AdRoot  Sign up/button_Sign up'))

String Ms = WebUI.verifyTextPresent('The E-mail address exists.', false)

if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 500) as int)

    WebUI.setText(findTestObject('Object Repository/SignUp/Page_AdRoot  Sign up/input_E-mail_email'), ('runayan' + RN) + 
        '@gmail.com')

    WebUI.sendKeys(findTestObject('SignUp/SignUp with email/Page_AdRoot  Sign up/button_Sign up'), Keys.chord(Keys.ENTER))
} else {
    WebUI.comment('Registration completed successfully.')
}

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Campaigns/div_Create'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Create Campaign Steps/span_Campaign name'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/div_Account'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/div_My Account'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/div_Account settings'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/button_Delete my Account'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Dashboard/div_Fill in your password_input-content'))

WebUI.setEncryptedText(findTestObject('Object Repository/Choose packages/Page_AdRoot  Dashboard/input_Fill in your password_custom-input'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/button_Deleting Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Choose packages/Page_AdRoot  Login/h2_Login into your account'), 
    0)

WebUI.closeBrowser()

