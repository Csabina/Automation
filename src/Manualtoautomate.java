import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manualtoautomate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/login-portal/index.html");
        Thread.sleep(2000);
        WebElement Firstname = driver.findElement(By.name("First_name"));
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
    }


    }

