import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Buka aplikasi'
Mobile.startApplication(GlobalVariable.apkname, true, FailureHandling.CONTINUE_ON_FAILURE)

'Check tombol berikutnya tampil'
Mobile.verifyElementExist(findTestObject('Onboarding/onboarding_button_berikutnya'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol berikutnya'
Mobile.tap(findTestObject('Onboarding/onboarding_button_berikutnya'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Check Overlay apakah sudah terdaftar di bidan sehati tampil'
Mobile.verifyElementExist(findTestObject('Onboarding/onboarding_button_sudah'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol sudah'
Mobile.tap(findTestObject('Onboarding/onboarding_button_sudah'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'wait'
Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Check halaman login tampil'
Mobile.verifyElementExist(findTestObject('Login/login_button_masuk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'isi no hp saat login'
Mobile.setText(findTestObject('Object Repository/Login/Kolom no hp'), GlobalVariable.idlogin, 0, FailureHandling.CONTINUE_ON_FAILURE)

'isi password saat login'
Mobile.setText(findTestObject('Object Repository/Login/Kolom password'), GlobalVariable.passwordlogin, 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap eyes icon'
Mobile.tap(findTestObject('Object Repository/Login/eyes icon'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Tap Masuk'
Mobile.tap(findTestObject('Login/login_button_masuk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi halaman beranda tampil'
Mobile.verifyElementExist(findTestObject('Object Repository/Beranda/Tombol Daftar Pasien Baru'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'tap Daftar pasien baru'
Mobile.tap(findTestObject('Object Repository/Beranda/Tombol Daftar Pasien Baru'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi overlay apakah sudah pernah terdaftar di sehati bidan lain tampil'
Mobile.verifyElementExist(findTestObject('Object Repository/Beranda/Overlay apakah sudah pernah terdaftar'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'close aplikasi'
Mobile.closeApplication(FailureHandling.CONTINUE_ON_FAILURE)

