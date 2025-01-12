Banka Uygulaması Test
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
* Eksik Kart Bilgisi Girilir
* Click to Add Button
* Eksik kart bilgisi hatası kontrolü
* Close the driver


(CASE5) -Kredi Kartı ile para yükleme
----------------------------
* Başarılı Login concept
* Click to Open Money
* Kart bilgisi girilir
* Click to Add Button
* Wait "2" seconds
* "1,000.00" textini add Transaction elementi ile karşılaştır
* Close the driver

(CASE6) -Hesabı Düzenleme
----------------------------
* Başarılı Login concept
* Click to Open Money
* Edit Account
* "emre.apaydinn" textini AccountName elementi ile karşılaştır
* Close the driver

(CASE7) - Başarılı Çıkış Yapma
----------------------------
* Başarılı Login concept
* Click to Logout Button
* Check if the Login element is present on the page.
* Close the driver