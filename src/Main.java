import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Downloads/chromedriver");
                WebDriver driver =new ChromeDriver();
                driver.get ("https://www.google.com");
                WebElement box= driver.findElement (By.name("q"));
                box.sendKeys("ikigai");
                box.submit();
    }
}
