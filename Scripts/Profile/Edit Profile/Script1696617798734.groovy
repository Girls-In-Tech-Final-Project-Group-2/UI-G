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

WebUI.callTestCase(findTestCase('Reusable_Test/Open_Homepage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Profile/btn_homepage_Login'))

WebUI.setText(findTestObject('Object Repository/Profile/inpt_Email'), email)

WebUI.setText(findTestObject('Object Repository/Profile/inpt_Password'), password)

WebUI.click(findTestObject('Object Repository/Profile/btn_Login'))

WebUI.click(findTestObject('Object Repository/Profile/btn_Change Address'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/txt_Edit Profile'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/label_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/label_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/label_Address'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/label_Phone Number'), 0)

WebUI.setText(findTestObject('Profile/inpt_address'), 'a')

WebUI.click(findTestObject('Object Repository/Profile/btn_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/txt_Hello, lala'), 0)

