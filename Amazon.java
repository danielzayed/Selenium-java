import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main ( String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\Documents\\SD\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.navigate().to("https://facebook.com");
        Thread.sleep(4000);
        driver.navigate().back();
        driver.quit();
    }
}
