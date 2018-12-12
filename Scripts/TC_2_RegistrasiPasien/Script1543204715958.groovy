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

//Mobile.startApplication(GlobalVariable.apk_bidan, true, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.startApplication('C:\\Users\\Sehati-Bedha\\Katalon Studio\\Bidan Sehati\\app-universal-debug.apk', true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('login/login_textfield_nohp'), '089635961916', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button6 - Simpan Tanggal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('login/login_textfield_password'), 'qwerty', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('Daftar_pasien/button_daftarpasienbaru'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Belum'), 0)

Mobile.setText(findTestObject('Daftar_pasien/daftar/android.widget.EditText0 - Nama Lengkap'), 'Nadine', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText1 - Tanggal Lahir'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText2 - Golongan Darah'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup4'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText3 - Agama'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup5'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText2 - Pendidikan Terakhir'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup11'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText3 - Pekerjaan Saat Ini'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.TextView4 - Pegawai Swasta'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Berikutnya (1)'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.RadioButton1 - Ya'), 0)

Mobile.setText(findTestObject('Daftar_pasien/daftar/android.widget.EditText0 - Nomor KTPNIK'), '0893818', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Berikutnya (2)'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText0 - Provinsi'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup4 (1)'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText1 - KotaKabupaten'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.EditText2 - Kecamatan'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.view.ViewGroup3'), 0)

Mobile.setText(findTestObject('Daftar_pasien/daftar/android.widget.EditText3 - Alamat'), 'Jl raya cilegon', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Simpan'), 0)

Mobile.tap(findTestObject('Daftar_pasien/daftar/android.widget.Button0 - Tidak'), 0)

Mobile.closeApplication()

