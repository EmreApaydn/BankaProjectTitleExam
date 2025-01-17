package WebMethods;


import Elements.Elements;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Log4j

public class Methods {
    FluentWait<WebDriver> wait;

    JavascriptExecutor jsdriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        Methods.webDriver = webDriver;
    }

    private static WebDriver webDriver;
    Long pollingEveryValue;
    public Methods () {

    }

    public WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void waitByMilliSeconds(long Milliseconds) {
        try {
            Thread.sleep(Milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info(+Milliseconds+ "milli saniye beklendi");
    }



    public Boolean isElementEnabled(By by,int tekrar){
        for (int i = 0; i <tekrar;i++){
            try {
                if(this.webDriver.findElement(by).isDisplayed() && this.webDriver.findElement(by).isEnabled()){
                    return true;
                }
            }
            catch (Exception var5){
            }
            waitByMilliSeconds(400L);
        }
        return false;
    }
    public void waitPageLoad(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        boolean isPageLoaded = (boolean) js.executeScript("return document.readyState").equals("complete");
        if (isPageLoaded){
            log.info("Sayfa yüklendi");
        }else {
            log.info("Sayfa yüklenmedi");
        }
    }
    public void setlog(String text){
        log.info(""+text+"");
    }

    public void clickElement(By by){
        findElement(by).click();
        log.info("Elemente tıklandı");
    }
    public void clearElement(By by){
        findElement(by).clear();
        log.info("Elementin Text alanı temizlendi");
    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
        log.info("Elemente "+text+" değeri yazıldı");
    }

    public void getText(By by){
        findElement(by).getText();
    }
    public void getAttribute(By by,String type){
        findElement(by).getAttribute(type);
    }

    public void acceptAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
    }
    public void close() {
        this.webDriver.close();
    }
    public List<String> listTabs() {
        List<String> list = new ArrayList();
        Iterator var2 = this.webDriver.getWindowHandles().iterator();

        while(var2.hasNext()) {
            String window = (String)var2.next();
            list.add(window);
        }

        return list;
    }
    public void switchTab(int tabNumber) {
        webDriver.switchTo().window((String)this.listTabs().get(tabNumber));
    }
    public void navigateTo(String url) {
        webDriver.navigate().to(url);
    }

    public void navigateToBack() {
        webDriver.navigate().back();
    }

    public void navigateToForward() {
        webDriver.navigate().forward();
    }

    public void navigateToRefresh() {
        webDriver.navigate().refresh();
    }
    public FluentWait<WebDriver> setFluentWait(long timeout) {
        FluentWait<WebDriver> fluentWait = new FluentWait(webDriver);
        fluentWait.withTimeout(Duration.ofSeconds(timeout)).pollingEvery(Duration.ofMillis(this.pollingEveryValue)).ignoring(NoSuchElementException.class);
        return fluentWait;
    }

    public void waitElement(By by){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        boolean isPageLoaded = (boolean) js.executeScript("return document.readyState").equals("complete");

        if (isPageLoaded) {
            System.out.println("Sayfa tamamen yüklendi");
        } else {
            System.out.println("Sayfa yüklenirken bir hata oluştu");
        }
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void setDriver(WebDriver driver) {
        webDriver = driver;
    }
}

