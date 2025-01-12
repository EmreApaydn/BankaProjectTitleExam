package Step;

import Driver.BaseTest;
import Elements.Elements;
import Page.LoginPage;
import WebMethods.Methods;
import com.github.dockerjava.api.model.Driver;
import com.thoughtworks.gauge.Step;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

@Log4j

public class StepImplementation {
    Methods methods;
    BaseTest baseTest;
    LoginPage locator = new LoginPage();

    public static int DEFAULT_MAX_ITERATION_COUNT = 75;
    public static int DEFAULT_MILLISECOND_WAIT_AMOUNT = 1500;

    public StepImplementation() {
        methods = new Methods();
        baseTest = new BaseTest();
    }

    @Step("Started with <driver>")
    public void ilkStep(String driver) {
        baseTest.setDriver(driver, "https://catchylabs-webclient.testinium.com/");
        log.info("Driver is started");

    }

    @Step("Close the driver")
    public void quitDriver() {
        baseTest.driverQuit();
        log.info("Driver is closed");
    }

    @Step("Wait <second> seconds")
    public void waitBySeconds(Long saniye) {
        methods.waitBySeconds(saniye);
        log.info("waited "+saniye+" seconds ");
    }

    @Step("<url> adresine git")
    public void navigateToUrl(String url) {
        methods.navigateTo(url);
    }

    @Step("Sitede geri git")
    public void navigateToBack() {
        methods.navigateToBack();
    }

    @Step("Sayfanın yüklenmesi beklenir")
    public void waitPageLoad(){
        methods.waitPageLoad();
    }

    @Step("Click to Open Money")
    public void clickOpenMoneyTransfer() {
        methods.click(Elements.OPEN_MONEY_TRANSFER);
    }

    @Step("Click to Login Button")
    public void clickLogin() {
        methods.click(Elements.LOGIN_BUTTON);
    }

    @Step("Click to Transfer Money")
    public void clickTransferMoney() {
        methods.click(Elements.TRANSFER_MONEY);
    }

    @Step("Click to Transfer Send")
    public void clickTransferSend() {
        methods.click(Elements.TRANSFER_SEND);
    }

    @Step("Click to Edit Account")
    public void clickEditAccount() {
        methods.click(Elements.EDIT_ACCOUNT);
    }

    @Step("Click to Edit Update")
    public void clickEditUpdate() {
        methods.click(Elements.EDIT_UPDATE_BUTTON);
    }

    @Step("Click to Add Money")
    public void clickAddMoney() {
        methods.click(Elements.ADD_MONEY);
    }

    @Step("Click to Add Button")
    public void clickAddButton() {
        methods.click(Elements.CARD_ADD_BUTTON);
    }

    @Step("Click to Logout Button")
    public void clickLogoutButton() {
        methods.click(Elements.LOGOUT_BUTTON);
    }

    @Step("Send keys <text> to username")
    public void sendkeysUsername(String text) {
        methods.click(Elements.LOGIN_USERNAME);
        methods.findElement(Elements.LOGIN_USERNAME).clear();
        methods.findElement(Elements.LOGIN_USERNAME).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.LOGIN_USERNAME + " .");
    }
    @Step("Send keys <text> to password")
    public void sendkeysPassword(String text) {
        methods.click(Elements.LOGIN_PASSWORD);
        methods.findElement(Elements.LOGIN_PASSWORD).clear();
        methods.findElement(Elements.LOGIN_PASSWORD).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.LOGIN_PASSWORD + " .");

    }
    @Step("Send keys <text> to Transfer Ammount")
    public void sendkeysTransferAmmount(String text) {
        methods.click(Elements.TRANSFER_AMMOUNT);
        methods.findElement(Elements.TRANSFER_AMMOUNT).clear();
        methods.findElement(Elements.TRANSFER_AMMOUNT).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.TRANSFER_AMMOUNT + " .");

    }
    @Step("Send keys <text> to Card Number")
    public void sendkeysCardNumber(String text) {
        methods.click(Elements.CARD_NUMBER);
        methods.findElement(Elements.CARD_NUMBER).clear();
        methods.findElement(Elements.CARD_NUMBER).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.CARD_NUMBER + " .");

    }
    @Step("Send keys <text> to Card Holder")
    public void sendkeysCardHolder(String text) {
        methods.click(Elements.CARD_HOLDER);
        methods.findElement(Elements.CARD_HOLDER).clear();
        methods.findElement(Elements.CARD_HOLDER).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.CARD_HOLDER + " .");

    }
    @Step("Send keys <text> to Card Expiry Date")
    public void sendkeysCardExpiry(String text) {
        scrollWithAction(Elements.CARD_EXPIRY_DATE);
        methods.click(Elements.CARD_EXPIRY_DATE);
        methods.findElement(Elements.CARD_EXPIRY_DATE).clear();
        methods.findElement(Elements.CARD_EXPIRY_DATE).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.CARD_EXPIRY_DATE + " .");

    }
    @Step("Send keys <text> to Card CVV")
    public void sendkeysCardCCV(String text) {
        scrollWithAction(Elements.CARD_CCV);
        methods.click(Elements.CARD_CCV);
        methods.findElement(Elements.CARD_CCV).clear();
        methods.findElement(Elements.CARD_CCV).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.CARD_CCV + " .");

    }

    @Step("Send keys <text> to Card Ammount")
    public void sendkeysCardAmmount(String text) {
        scrollWithAction(Elements.CARD_ADD_AMMOUNT);
        methods.click(Elements.CARD_ADD_AMMOUNT);
        methods.findElement(Elements.CARD_ADD_AMMOUNT).clear();
        methods.findElement(Elements.CARD_ADD_AMMOUNT).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.CARD_ADD_AMMOUNT + " .");

    }

    public void scrollWithAction(By by) {
        Actions actions = new Actions(BaseTest.webDriver);
        actions.moveToElement(methods.findElement(by)).build().perform();
        log.info("This element " + locator + " has been scrolled.");
    }

    @Step("Send keys <text> to Account Name")
    public void sendkeysEditAccountName(String text) {
        methods.click(Elements.EDIT_ACCOUNT_NAME);
        methods.findElement(Elements.EDIT_ACCOUNT_NAME).clear();
        methods.findElement(Elements.EDIT_ACCOUNT_NAME).sendKeys(text);
        log.info(text + " has been written to this element " + Elements.EDIT_ACCOUNT_NAME + " .");

    }

    @Step("<locator> elementi sayfada var mı kontrol et")
    public boolean isDisplayed(By locator) {
        log.info(locator + " Element located.");
        return methods.findElement(locator).isDisplayed();
    }
    @Step("<seconds> saniye bekle")
    public void waitInSeconds(int seconds) throws InterruptedException {
        Thread.sleep(1000 * seconds);
    }

    @Step("Check if the invalid email/password element is present on the page.")
    public boolean loginAllertIsDisplayed() {
        log.info(Elements.LOGIN_ALLERT + " Element located.");
        return methods.findElement(Elements.LOGIN_ALLERT).isDisplayed();
    }

    @Step("Check if the Login element is present on the page.")
    public boolean loginButtonIsDisplayed() {
        log.info(Elements.LOGIN_BUTTON + " Element located.");
        return methods.findElement(Elements.LOGIN_BUTTON).isDisplayed();
    }

    @Step("Check the Successful Login")
    public boolean logoutLogoDisplayed() {
        log.info(Elements.LOGOUT_LOGO + " Element located.");
        return methods.findElement(Elements.LOGOUT_LOGO).isDisplayed();
    }
    @Step("<text> textini Transaction elementi ile karşılaştır")
    public void transferMoneyCompare(String text) {
        WebElement element = methods.findElement(Elements.TRANSACTION_AMMOUNT);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini add Transaction elementi ile karşılaştır")
    public void addMoneyCompare(String text) {
        WebElement element = methods.findElement(Elements.TRANSACTION_AMMOUNT);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini Expiry date hata elementi ile karşılaştır")
    public void ExpiryDateReq(String text) {
        WebElement element = methods.findElement(Elements.CARD_EXPIRY_REQIRED);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini CVV hata elementi ile karşılaştır")
    public void CVVReq(String text) {
        WebElement element = methods.findElement(Elements.CARD_CVV_REQIRED);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini Amount hata elementi ile karşılaştır")
    public void AmountReq(String text) {
        WebElement element = methods.findElement(Elements.CARD_AMOUNT_REQIRED);
        String compare = element.getText();
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }

    @Step("<text> textini AccountName elementi ile karşılaştır")
    public void accountNameCompare(String text) {
        WebElement element = methods.findElement(Elements.ACCOUNT_NAME);
        String compare = element.getText();
        System.out.println(compare);
        assertTrue(compare.equals(text));
        log.info(text + " textiyle " + compare + " texti karşılaştırıldı.");

    }
}

