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

WebUI.setViewPortSize(1500, 900)

WebUI.setText(findTestObject('Object Repository/Edit audience/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit audience/Page_AdRoot  Login/input_Password_password'), '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Dashboard/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Dashboard/a_Audience  Interests'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_audience139_tree-dots dots-blue'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_Edit'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_From_arrow'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_20'))

WebUI.click(findTestObject('Edit audience/Page_AdRoot  Campaigns/div_To_arrow'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_24'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/label_Male'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/body_DEVROI LABDashboardCampaignsMedia Libr_78fc9d'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/label_Estonian'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/body_DEVROI LABDashboardCampaignsMedia Libr_78fc9d_1'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/label_Uruguay'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/button_Update This Audience'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_audience13922022022'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_20, 24'))

WebUI.click(findTestObject('Object Repository/Edit audience/Page_AdRoot  Campaigns/div_male'))

WebUI.closeBrowser()

