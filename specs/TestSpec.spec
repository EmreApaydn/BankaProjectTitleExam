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

(CASE4) -Kredi Kartı bilgilerini eksik girerek hata alma
----------------------------
* Başarılı Login concept
* Click to Open Money
* Click to Add Money
* Send keys "1234 1234 1234 1234" to Card Number
* Send keys "Emre Apaydın" to Card Holder
* Wait "1" seconds
* Click to Add Button
* Wait "1" seconds
* "Required" textini Expiry date hata elementi ile karşılaştır
* "Required" textini CVV hata elementi ile karşılaştır
* "Required" textini Amount hata elementi ile karşılaştır
* Close the driver


(CASE5) -Kredi Kartı ile para yükleme
----------------------------
* Başarılı Login concept
* Click to Open Money
* Click to Add Money
* Send keys "1234 1234 1234 1234" to Card Number
* Send keys "Emre Apaydın" to Card Holder
* Send keys "10/26" to Card Expiry Date
* Send keys "110" to Card CVV
* Send keys "1000" to Card Ammount
* Click to Add Button
* "1000" textini add Transaction elementi ile karşılaştır
* Close the driver

(CASE6) -Hesabı Düzenleme
----------------------------
* Başarılı Login concept
* Click to Open Money
* Click to Edit Account
* Wait "1" seconds
* Send keys "emre.apaydinn" to Account Name
* Click to Edit Update
* "emre.apaydinn" textini AccountName elementi ile karşılaştır
* Close the driver

(CASE7) - Başarılı Çıkış Yapma
----------------------------
* Başarılı Login concept
* Click to Logout Button
* Check if the Login element is present on the page.
* Close the driver