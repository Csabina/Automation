import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.AbstractExecutorService;

public class Seleniumgoogleinspector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Downloads/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get ("https://google.com");
        Thread.sleep(2000);
        WebElement box= driver.findElement(By.id("q"));
        box.sendKeys("https://dart-tutorial.com/");
        Thread.sleep(2000);
        WebElement hig = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[2]/a"));
        hig.click();
        Thread.sleep(2000);
        driver.navigate().back();
    }
}




