import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Object Repository/Page_Twitter Its whats happening/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Login on Twitter/input_Log in_sessionusername_or_email'), 'fakhrezasusilo')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login on Twitter/input_Log in_sessionpassword'), 'fgYeaaSOICNaOfoa40N2gA==')

WebUI.click(findTestObject('Object Repository/Page_Login on Twitter/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Home  Twitter/svg_Fakhreza Akbar S_r-13gxpu9 r-4qtqp9 r-yyyyoo r-1q142lx r-1xvli5t r-5f2r5o r-dnmrzs r-bnwqim r-1plcrui r-lrvibr'))

WebUI.click(findTestObject('Object Repository/Page_Home  Twitter/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Twitter/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Twitter Its whats happening/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Login on Twitter/input_Log in_sessionusername_or_email'), 'fakhrezasusilo15')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login on Twitter/input_Log in_sessionpassword'), 'YFZfyx+NhJE=')

WebUI.click(findTestObject('Object Repository/Page_Login on Twitter/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Login on Twitter/span_Home'))

WebUI.click(findTestObject('Object Repository/Page_Twitter Its whats happening/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/input_Name_name'), 'Fakhreza')

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/input_Phone_phone_number'), '081223465859')

WebUI.click(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/div_Create your accountName850PhoneUse email instead'))

WebUI.click(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Twitter/span_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_Twitter/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/div_Step 1 of 4_css-1dbjc4n r-13w96dm r-1p0dtai r-1d2f490 r-1xcajam r-zchlnj r-ipm5af'))

WebUI.click(findTestObject('Object Repository/Page_Twitter Its whats happening  Twitter/span_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/input_Name_name'), 'Fakhreza')

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/input_Phone_phone_number'), '</script>')

WebUI.click(findTestObject('Object Repository/Page_Sign up for Twitter  Twitter/div_Create your accountName850PhonePlease enter a valid phone numberUse email instead'))

WebUI.closeBrowser()

