Specification Heading
=====================

(CASE1) -Giriş yapılırken hatalı bilgi girilmesi
---------------------------
* Started with "Chrome"
* Send keys "emre.apaydin" to username
* Send keys "Test1234" to password
* Click to Login Button
* Check if the invalid email/password element is present on the page.
* Close the driver

(CASE2) -Başarılı Giriş
----------------------------
* Started with "Chrome"
* Send keys "emre.apaydin" to username
* Send keys "Sifre3557" to password
* Click to Login Button
* Check the Successful Login
* Wait "2" seconds
* Close the driver

(CASE3) -Başarılı Para Transferi
----------------------------
* Başarılı Login concept
* Click to Open Money
* Click to Transfer Money
* Wait "1" seconds
* Send keys "10" to Transfer Ammount
* Click to Transfer Send
* "10" textini Transaction elementi ile karşılaştır
* Close the driver

(CASE4) -Hesabı Düzenleme
----------------------------
* Başarılı Login concept
* Click to Open Money
* Click to Edit Account
* Wait "1" seconds
* Send keys "emre.apaydinn" to Account Name
* Click to Edit Update
* "emre.apaydinn" textini AccountName elementi ile karşılaştır
* Close the driver