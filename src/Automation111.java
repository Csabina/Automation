import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation111 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/sabinachaulagain/Documents/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");

        WebElement a=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
        a.click();
        WebElement b= driver.findElement(By.xpath("//*[@id=\"manual-testing-description\"]/p"));
        System.out.println(b.getText());

    }
}
