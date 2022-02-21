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

WebUI.setText(findTestObject('Object Repository/Audience create/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Audience create/Page_AdRoot  Login/input_Password_password'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.sendKeys(findTestObject('Object Repository/Audience create/Page_AdRoot  Login/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Dashboard/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Dashboard/a_Audience  Interests'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/button_Create New Audience'))

WebUI.setText(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/input_Audience Name_custom-input'), 
    'audience')

String Ms = WebUI.verifyTextPresent('Name is taken', false)

if (Ms.equals('true')) {
    int RN

    RN = ((Math.random() * 5000) as int)

    WebUI.setText(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/input_Audience Name_input-invalid custom-input'), 
        'audience' + RN)
} else {
    WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/div_To_arrow'))
}

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/div_To_arrow'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/div_20'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/label_Female'))

WebUI.click(findTestObject('Audience create/Page_AdRoot  Campaigns/div'))

WebUI.click(findTestObject('Audience create/Page_AdRoot  Campaigns/label_Albania'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/body_DEVROI LABDashboardCampaignsMedia Libr_78fc9d_1'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/li_Dutch'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/div'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/button_Save This Audience'))

WebUI.click(findTestObject('Object Repository/Audience create/Page_AdRoot  Campaigns/div_Audience saved successfully'))

WebUI.closeBrowser()

