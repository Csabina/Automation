import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumwork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Downloads/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get ("https://dart-tutorial.com//");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}


