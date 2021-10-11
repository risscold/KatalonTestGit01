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

//Mobile.startApplication('/Users/Apps/Android/Alodokter_user_v3.6.0_staging_debug_300921_1624.apk', true)
WebUI.callTestCase(findTestCase('ByRecord/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.TextView - Keluarga Saya'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.TextView - Tambah Profil'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.EditText - Pilih Hubungan'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.RadioButton - Anak'), 0)

Mobile.setText(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.EditText - Nama Lengkap'), 'auto add fam', 
    0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.EditText - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.TextView - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.Button - Laki-laki'), 0)

Mobile.setText(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.EditText - Nomor KTP Orang Tua atau Wali'), 
    '1111111111111111', 0)

Mobile.setText(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.EditText - Alamat Sesuai KTP Orang Tua atau Wali'), 
    'jalan jakarta raya', 0)

Mobile.tap(findTestObject('Object Repository/ByRecord/AddFamily/android.widget.TextView - Simpan (1)'), 0)

