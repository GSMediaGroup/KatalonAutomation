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

WebUI.navigateToUrl('https://app.adroot.io/auth/signup')

WebUI.setText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_Full name_first_name'), 
    'Adroot Test')

WebUI.setText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_E-mail_email'), 'runaavetisyan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_Password_password'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_Confirm password_confirm'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/div_Confirm password_checkbox'))

WebUI.click(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/button_Sign up'))

WebUI.click(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/span_The E-mail address exists'))

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

WebUI.click(findTestObject('Choose packages/business package/Page_AdRoot  Sign up/button_Sign up_1'))

WebUI.waitForElementPresent(findTestObject('Choose packages/basic package/Page_AdRoot Technologies LLC/input__cardNumber'), 
    0)

WebUI.setText(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot Technologies LLC/input__cardNumber'), 
    '5406 6100 0080 8837')

WebUI.setText(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot Technologies LLC/input__cardExpiry'), 
    '12 / 23')

WebUI.setText(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot Technologies LLC/input__cardCvc'), 
    '403')

WebUI.setText(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot Technologies LLC/input__billingName'), 
    'Harutyun Aghayan')

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot Technologies LLC/div__SubmitButton-IconContainer'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/img_No any notification_non-draggable-image_8aff0b'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/div_My Account'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/div_Payment'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/div_8837'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/div_View More_window-top-close'))

WebUI.click(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Campaigns/button_Create campaign'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Choose packages/basic package/Page_AdRoot  Create Campaign Steps/span_Campaign name'), 
    0)

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Campaigns/div_Account'))

WebUI.closeBrowser()

