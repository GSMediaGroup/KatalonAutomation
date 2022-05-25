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

WebUI.navigateToUrl('https://dev.adroot.io/auth/signup')

WebUI.setText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_Full name_first_name'), 
    'Adroot Test')

WebUI.setText(findTestObject('Object Repository/SignUp/SignUp with email/Page_AdRoot  Sign up/input_E-mail_email'), 'makronmanuel01@gmail.com')

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

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Sign up/button_Skip Payment'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Dashboard/span_campaigns'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Campaigns/button_Create campaign'))

WebUI.verifyElementPresent(findTestObject('SignUp/Page_AdRoot  Campaigns/div_You cant create campaign because on account havent active subscription'), 
    0)

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Campaigns/div_'))

WebUI.click(findTestObject('Object Repository/Choose packages/Page_AdRoot  Sign up/Page_AdRoot  Campaigns/button_Create campaign_1'))

WebUI.verifyElementPresent(findTestObject('SignUp/Page_AdRoot  Campaigns/div_You cant create campaign because on account havent active subscription'), 
    0)

WebUI.closeBrowser()

