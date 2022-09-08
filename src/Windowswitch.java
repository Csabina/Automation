
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Windowswitch {
    //go to webdriveruniversity click on contact us form & switch to login page
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/");
        driver.findElement(By.id("contact-us")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement Firstname = driver.findElement(By.name("first_name"));
        WebElement lastname = driver.findElement(By.name("last_name"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement comments = driver.findElement(By.name("message"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        Thread.sleep(2000);
        Firstname.sendKeys("sabina");
        lastname.sendKeys("chaulagain");
        email.sendKeys("sabina@gmail.com");
        comments.sendKeys("Learning java");
        submitButton.click();
        driver.close();
        driver.switchTo().window(tabs.get(0));

        driver.findElement(By.id("login-portal")).click();
        tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabs);
        driver.switchTo().window(tabs.get(1));


        WebElement user = driver.findElement(By.id( "text"));
        user.sendKeys( "Webdriver");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("webdriver123");
        WebElement login = driver.findElement(By.id("login-button"));

        login.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.close();


    }


}


