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

WebUI.setViewPortSize(1550, 900)

WebUI.navigateToUrl('https://dev.adroot.io/auth/signin')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/input_Password_password'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/div_MakronOwner'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Regular Create campaign/Page_AdRoot  Campaigns/div_Campaign View'))

WebUI.click(findTestObject('Regular Create campaign/Page_AdRoot  Campaigns/div_New Campaign'))

WebUI.setText(findTestObject('Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'), 'devadroot1')

WebUI.click(findTestObject('Goals/Goals/Page_AdRoot  Create Campaign Steps/div_Video Views'))

WebUI.click(findTestObject('Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/span_Name is taken'))

String Ms = WebUI.verifyTextPresent('Name is taken', false)

if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 5000) as int)

    WebUI.setText(findTestObject('Regular Create campaign/Page_AdRoot Ad Manager - One Place To Manag_7de57e/Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'), 
        'devadroot' + RN)

    WebUI.sendKeys(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'))
}

WebUI.verifyElementPresent(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_Artashes Mxchyan'), 0)

WebUI.click(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.click(findTestObject('Object Repository/Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Primary Text_invalid custom-input'))

WebUI.setText(findTestObject('Object Repository/Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Primary Text_invalid custom-input'), 
    'Social media')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Headline_custom-input'), 
    'Social media ads management ')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Ad Description_custom-input'), 
    'Our Mission is to create one place for all advertising needs')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/input_Website URL_custom-input'), 'gsmediagroup.net')

WebUI.click(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_Choose AD'))

WebUI.click(findTestObject('Object Repository/Goals/Page_AdRoot  Create Campaign Steps/div_Videos_image-cont video'))

WebUI.click(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/button_Select'))

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.setText(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/input_Daily_custom-input'), 
    '$ 1')

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Campaigns/div_PENDING'), 0)

WebUI.closeBrowser()

