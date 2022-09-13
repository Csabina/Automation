//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.security.Key;
//import java.util.Scanner;
//
//public class Pricecompare {
//    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Which book do you want to search: ");
//        String book = sc.nextLine();
//
//        System.setProperty("webdriver.chrome.driver", "/Users/sabinachaulagain/Documents/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        String web1target = "https://www.target.com/";
//        String web2barnesandnoble = "https://www.barnesandnoble.com/";
//
//        driver.manage().window().maximize();
//// First Website
//        driver.get(web1target);
//        WebElement searchBox1 = driver.findElement(By.id("search"));
//        searchBox1.sendKeys(book);
//        searchBox1.submit();
//        Thread.sleep(3000);
//        WebElement firstItem = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div[4]/div/div/div[2]/div/section/div/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/span[1]/span"));
//        double p1 = Double.parseDouble(firstItem.getText().replace("$",""));
//        System.out.println(p1);
//
//// Second Website
//        driver.get(web2barnesandnoble);
//        WebElement searchBox2 = driver.findElement(By.xpath("//*[@id=\"rhf_header_element\"]/nav/div/div[3]/form/div/div[2]/div/input[1]"));
//        searchBox2.sendKeys(book);
//        searchBox2.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//        WebElement secondItem = driver.findElement(By.xpath("//*[@id=\"gridView\"]/div/div[1]/div[2]/div[4]/div/a/span[2]"));
//        double p2 = Double.parseDouble(secondItem.getText().replace("$",""));
//        System.out.println(p2);
//
//        if(p1<p2){
//            System.out.println(web1target + " prize is less by "+(p2-p1));
//        }else{
//            System.out.println(web2barnesandnoble + "price is less by "+ (p1-p2));
//        }
//
