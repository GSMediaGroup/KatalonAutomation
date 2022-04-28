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

WebUI.click(findTestObject('Campaign copy/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/App-Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/button_Create campaign'))

WebUI.setText(findTestObject('Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'), 'devadroot1')

WebUI.click(findTestObject('Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/span_Name is taken'))

String Ms = WebUI.verifyTextPresent('Name is taken', false)

if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 5000) as int)

    WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Campaign name_invalid custom-input'), 
        'devadroot' + RN)

    WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'))
} else {
    WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'))
}

WebUI.verifyElementPresent(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_GS PubSense'), 0)

WebUI.verifyElementPresent(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_Artashes Mxchyan'), 0)

WebUI.click(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.click(findTestObject('Audience/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/div_autofill form_toggle-arrow'))

WebUI.click(findTestObject('Object Repository/Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Primary Text_invalid custom-input'))

WebUI.setText(findTestObject('Object Repository/Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Primary Text_invalid custom-input'), 
    'Social media')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Headline_custom-input'), 
    'Social media ads management ')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/input_Ad Description_custom-input'), 
    'Our Mission is to create one place for all advertising needs')

WebUI.setText(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/input_Website URL_custom-input'), 'gsmediagroup.net')

WebUI.click(findTestObject('Object Repository/App-Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/div_Choose AD'))

WebUI.doubleClick(findTestObject('Regular Create campaign/Page_AdRoot  Create Campaign Steps/span_600x600.jpg'))

WebUI.click(findTestObject('Object Repository/App-Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.setText(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/input_Business Name_custom-input'), 'GS media')

WebUI.setText(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/input_Long headline_custom-input'), 'Ad management system')

WebUI.click(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Step3/Create campaign dev/Page_AdRoot  Create Campaign Steps/div_Ad_edit (1)'))

WebUI.setText(findTestObject('Object Repository/Step3/Create campaign dev/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input (1)'), 
    'Create campaign')

WebUI.click(findTestObject('Object Repository/Step3/Create campaign dev/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input (1)'))

WebUI.setText(findTestObject('Object Repository/Step3/Create campaign dev/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1 (1)'), 
    'Create ads')

WebUI.setText(findTestObject('Object Repository/Step3/Create campaign dev/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1_2 (1)'), 
    'Create ads')

WebUI.click(findTestObject('Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/textarea_Enter Keywords_custom-input'))

WebUI.setText(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/textarea_create campaign'), 
    'create campaign')

WebUI.click(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/App-Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.click(findTestObject('Object Repository/App-Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.setText(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/input_Daily_custom-input'), 
    '$ 1')

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/input_Start_single-date-picker-datepicker-y6DXOBYbq5i4SX3nAPEZ'))

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/svg_Su_DayPickerNavigation_svg__horizontal DayPickerNavigation_svg__horizontal_1'))

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/svg_Su_DayPickerNavigation_svg__horizontal DayPickerNavigation_svg__horizontal_1'))

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/svg_Su_DayPickerNavigation_svg__horizontal DayPickerNavigation_svg__horizontal_1'))

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/svg_Su_DayPickerNavigation_svg__horizontal DayPickerNavigation_svg__horizontal_1'))

WebUI.click(findTestObject('Step 4,5/Page_AdRoot  Create Campaign Steps/td_10'))

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Finish'))

WebUI.click(findTestObject('Campaign copy/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

