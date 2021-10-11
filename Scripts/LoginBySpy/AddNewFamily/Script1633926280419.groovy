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

//Mobile.startApplication('/Users/Apps/Android/Alodokter_user_v3.6.0_staging_debug_300921_1624.apk', false)
WebUI.callTestCase(findTestCase('BySpy/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_ToUserProfile'), 0)
Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_MenuKeluargaSaya'), 0)

Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_TambahProfil'), 0)
Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_PilihHubungan'), 0)
Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_rad_Anak'), 0)
Mobile.setText(findTestObject('Object Repository/BySpy/AddFamily/RFN_txt_NamaLengkap'), 'auto user fam', 0)
Mobile.setText(findTestObject('Object Repository/BySpy/AddFamily/RFN_txt_TanggalLahir'), '01/01/1991', 0)
Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_GenderLaki-laki'), 0)
Mobile.setText(findTestObject('Object Repository/BySpy/AddFamily/RFN_txt_NomorKTP'), '11111111111111111', 0)
Mobile.setText(findTestObject('Object Repository/BySpy/AddFamily/RFN_txt_Alamat'), 'jalan jakarta raya', 0)
Mobile.tap(findTestObject('Object Repository/BySpy/AddFamily/RFN_btn_SimpanFamData'), 0)