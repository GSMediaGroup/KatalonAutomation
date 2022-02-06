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

WebUI.callTestCase(findTestCase('Everyday create campaign/dev-Create campaign/dev-create campaign name'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_GS PubSense'), 0)

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

WebUI.click(findTestObject('Step2/Page_AdRoot  Create Campaign Steps/div_cropped-512adroot.jpg_image-cont image'))

WebUI.click(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/button_Select'))

WebUI.mouseOver(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/div_Open_actions-mode'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Step3/Page_AdRoot  Create Campaign Steps/Page_AdRoot  Create Campaign Steps/div_Open_actions-mode'))

WebUI.click(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/div_Open_edit'))

WebUI.setText(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/input_Business Name_custom-input'), 'GS media')

WebUI.setText(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/input_Long headline_custom-input'), 'Ad management system')

WebUI.click(findTestObject('Step3/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.mouseOver(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/div_Ad_actions-mode'))

WebUI.mouseOver(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/div_1052horAdhoem.comhoreAdAdAd'))

WebUI.click(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/div_Ad_actions-mode'))

WebUI.click(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/div_Ad_edit'))

WebUI.setText(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input'), 
    'Create ads')

WebUI.setText(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1'), 
    'Create campaigns')

WebUI.setText(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/input_Prohibited_custom-input_1_2'), 
    'Ad management system')

WebUI.click(findTestObject('Object Repository/Step3/Step 3 Google search/Page_AdRoot  Create Campaign Steps/button_Save'))

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Next Step (1)'))

WebUI.setText(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/input_Daily_custom-input'), 
    '$ 1')

WebUI.click(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Create Campaign Steps/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Step 4,5/Page_AdRoot  Campaigns/div_PENDING'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

