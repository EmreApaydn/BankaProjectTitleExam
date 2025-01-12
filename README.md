# Selenium Test Otomasyon Projesi

Bu proje, Selenium kullanarak web uygulamalarında otomasyon testi yapmak için geliştirilmiştir. Proje, birden fazla sınıf ve yöntem kullanılarak test süreçlerini kolaylaştırmayı ve yapılandırmayı hedefler.

## Proje Yapısı

### 1. WebMethods (Metotlar)
`Methods` sınıfı, Selenium WebDriver ile kullanılan genel metotları içerir. Bu metotlar, web elementlerini bulma, tıklama, metin gönderme, sayfa yüklenmesini bekleme gibi işlemleri kolaylaştırır.

### 2. Step (Adımlar)
`StepImplementation` sınıfı, test senaryolarında kullanılan adımları içerir. Bu adımlar, test edilen web uygulamasındaki kullanıcı davranışlarını simüle eder ve Gauge framework'ü ile çalışır.

### 3. Driver (Sürücü Yönetimi)
`BaseTest` sınıfı, farklı tarayıcılarda testleri başlatmak ve tarayıcı oturumunu yönetmek için gerekli ayarları yapar. Tarayıcılar arasında Chrome ve Firefox desteklenir.

### 4. Elements (Element Tanımlamaları)
`Elements` sınıfı, test senaryolarında kullanılan tüm web elementlerini merkezi bir konumda toplar. Elementler `By` sınıfı kullanılarak tanımlanmıştır ve kolay erişim sağlar.

---

## Kullanılan Teknolojiler

- **Java**: Programlama dili
- **Selenium WebDriver**: Web otomasyonu
- **Gauge Framework**: Test senaryolarını yazmak için
- **Lombok**: Loglama ve boilerplate kodları azaltmak için
- **WebDriverManager**: Tarayıcı sürücülerinin yönetimi
- **JUnit**: Test işlemleri

---

## Projeyi Çalıştırma

### Gereksinimler
- Java JDK (minimum 11)
- Maven
- Chrome veya Firefox tarayıcıları
