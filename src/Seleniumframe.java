import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumframe {
    public static void main(String[] args) throws InterruptedException {
//*[@id="body-inner"]/div[1]/h3/a
        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");

        driver.manage().window().fullscreen();

        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"ourframe\"]"));

        driver.switchTo().frame(iframe);



        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        num1.sendKeys("1000");
        num2.sendKeys("2000");
        WebElement button = driver.findElement(By.xpath("/html/body/div/button"));
        button.click();

    }
}