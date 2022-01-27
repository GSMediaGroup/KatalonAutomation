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

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/input_Password_password'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Dashboard/div_MakronOwner'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Dashboard/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/div_New Campaign'))

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'), 
    'devadroot')

String Mt = WebUI.verifyTextPresent('Name is taken', false)

if (Mt.equals('true')) {
    int RM

    RM = ((Math.random() * 500) as int)

    WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'), 
        'devadroot' + RM)

    WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))
} else {
    WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))
}

WebUI.verifyTextPresent('Artashes Mxchyan', false)

WebUI.verifyTextPresent('GS PubSense', false)

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Primary Text_custom-input'), 
    'Social Media Ad Management Software')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Headline_custom-input'), 
    'Create, Manage, Report and Collaborate on All Your Ads in One Place')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Ad Description_custom-input'), 
    'Create ads in easy way')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Website URL_custom-input'), 
    'gsmediagroup.net')

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_Choose AD'))

WebUI.doubleClick(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_All_image-cont image'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Business Name_custom-input'), 
    'GS media')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Long headline_custom-input'), 
    'Create ads')

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input'), 
    'Create ads')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1'), 
    'Manage ads')

WebUI.setText(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1_2'), 
    'Ad management system')

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/body_DEVROI LABDashboardCampaignsMedia Libr_78fc9d'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/li_Apply Now'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/body_DEVROI LABDashboardCampaignsMedia Libr_78fc9d_1'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/li_Apply Now'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.closeBrowser()

