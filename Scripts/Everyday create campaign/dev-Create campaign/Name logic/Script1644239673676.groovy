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


String Ms = WebUI.verifyTextPresent('Name is taken', false)

if (Ms.equals('true')) {
	int RN

	RN = ((Math.random() * 5000) as int)

	WebUI.setText(findTestObject('Regular Create campaign/Page_AdRoot Ad Manager - One Place To Manag_7de57e/Page_AdRoot  Create Campaign Steps/input_Campaign name_custom-input'),
		'devadroot' + RN)

	WebUI.sendKeys(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'), Keys.chord(Keys.ENTER))
} else {
	WebUI.click(findTestObject('Object Repository/Regular Create campaign/Page_AdRoot  Campaigns/Page_AdRoot  Create Campaign Steps/button_Next Step'))
}

