import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/sabinachaulagain/Documents/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        Thread.sleep(2000);
        Select dropDown = new Select(driver.findElement(By.id("dropdowm-menu-3")));
        dropDown.selectByVisibleText("JQuery");


    }
}
