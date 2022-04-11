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

WebUI.setText(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Login/input_E-mail_email'), 'makronmanuel01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Login/input_Password_password'), 
    '9juLMCYi8sYpY2Mrwe5diw==')

WebUI.sendKeys(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Login/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Dashboard/img'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Dashboard/div_By Ruzan (dev)'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Campaigns/div_Campaign View'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Campaigns/div_IN REVIEW_tree-dots dots-blue'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Campaigns/div_Delete'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Campaigns/button_Delete'))

WebUI.click(findTestObject('Object Repository/Delete campaign/Delete ad/Page_AdRoot  Dashboard/a_Campaigns'))

WebUI.closeBrowser()

