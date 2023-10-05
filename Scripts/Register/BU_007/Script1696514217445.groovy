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

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

println('nama: ' + name)

println('random numbernya: ' + randomNumber)

def name = name + randomNumber

println('Nama barunya: ' + name)

//Alamat
println('address: ' + address)

println('random numbernya: ' + randomNumber)

def address = address + randomNumber

println('Alamat barunya: ' + address)

def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

println('value random custom defined dari keyword: ' + randomDefinedNumber)

def email = ('name' + randomDefinedNumber) + '@gmail.com'

println(email)

WebUI.callTestCase(findTestCase('Reusable_Test/Open_Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register/btn_homepage_Register'))

WebUI.verifyElementPresent(findTestObject('Register/txt_Register'), 0)

WebUI.setText(findTestObject('Register/inpt_Name'), name)

WebUI.setText(findTestObject('Register/inpt_Email'), email)

WebUI.setText(findTestObject('Register/inpt_Address'), address)

WebUI.setText(findTestObject('Register/inpt_Password'), password)

WebUI.click(findTestObject('Register/btn_Register'))

WebUI.verifyElementPresent(findTestObject('Register/inpt_Error_Register'), 0)

