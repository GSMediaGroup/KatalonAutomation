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

WebUI.setViewPortSize(1550, 900)

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Login/input_E-mail_email'))

WebUI.setText(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Login/input_Password_password'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Dashboard/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Campaigns/div_Campaign View'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Campaigns/div_PAUSED_tree-dots dots-blue'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Campaigns/div_Edit'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_autofill form_toggle-arrow'))

WebUI.doubleClick(findTestObject('Edit campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/input_Primary Text_custom-input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Edit campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/input_Primary Text_custom-input'), 
    'Social media1')

WebUI.doubleClick(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/input_Website URL_custom-input'))

WebUI.setText(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/input_Website URL_custom-input'), 
    'home.com')

WebUI.setText(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/input_Headline_custom-input'), 
    'Social media ads management 1')

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/input_Ad Description_custom-input'))

WebUI.setText(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/input_Ad Description_custom-input'), 
    'Our Mission is to create one place f111or all advertising needs')

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_Artboard  2.png_remove-icon'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_Choose AD'))

WebUI.doubleClick(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_All_image-cont image'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_To_arrow'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/div_54'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/label_Female'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/button_Next Step'))

WebUI.click(findTestObject('Object Repository/Edit campaign/Page_AdRoot  Create Campaign Steps/button_Finish'))

WebUI.closeBrowser()

