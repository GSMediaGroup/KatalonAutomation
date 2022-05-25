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

WebUI.navigateToUrl('https://app.adroot.io/auth/signin')

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Login/a_Sign up now'))

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Sign up/button_Sign Up'))

WebUI.switchToWindowTitle('Մտնել Google հաշիվներ')

WebUI.setText(findTestObject('Object Repository/Google sign up/Google sign up free/Page_Google/input_adroot.io_identifier'), 
    'ruzan.a@adroot.io')

WebUI.sendKeys(findTestObject('Object Repository/Google sign up/Google sign up free/Page_Google/input_adroot.io_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Google sign up/Google sign up free/Page_Google/input__password'), 
    'cuON/d2luFqbpP2tciHsMA==')

WebUI.sendKeys(findTestObject('Object Repository/Google sign up/Google sign up free/Page_Google/input__password'), Keys.chord(
        Keys.ENTER))

WebUI.switchToWindowTitle('AdRoot ‒ Sign up')

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Sign up/button_Sign up (1)'))

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Dashboard/span_campaigns'))

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Campaigns/button_Create campaign'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Create Campaign Steps/span_Campaign name'), 
    0)

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Campaigns/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Campaigns/button_Create campaign_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Create Campaign Steps/span_Campaign name'), 
    0)

WebUI.click(findTestObject('Object Repository/Google sign up/Google sign up free/Page_AdRoot  Campaigns/a_Campaigns'))

WebUI.navigateToUrl('http://app-admin.adroot.io')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/input_Enter password_inputPassword'), 
    'ee6Lm51R6ZuLjcWYFk+aOY05hNIKNColS2aaZOhtgpc=')

WebUI.click(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/a_Users'))

WebUI.click(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/button_Open Filtering'))

WebUI.setText(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/input__form-control'), 'ruzan.a@adroot.io')

WebUI.click(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/button_X'))

WebUI.click(findTestObject('Object Repository/Facebook sign up/Page_Adroot Admin/div_Logout'))

WebUI.closeBrowser()

