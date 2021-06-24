import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class yahooWebsite {
    public static void main ( String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\Documents\\SD\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/");
        try {
            driver.findElement(
                    By.xpath("//input[@id='login-username']")).sendKeys(
                    "edureka@yahoo.com");
            Thread.sleep(10000);
            driver.findElement(By.xpath("//input[@id='login-signin']")).click();
            Thread.sleep(10000);
            WebElement rCheckBox=driver.findElement(By.className("recaptcha-checkbox-borderAnimation"));
            rCheckBox.click();
            Thread.sleep(10000);
            driver.findElement(By.id("recaptcha-submit")).click();
            Thread.sleep(10000);
        }
        catch (NoSuchElementException nSEE){
            System.out.println("MAIN IS FAILED LOCATING AN ELEMENT ... driver is closed so...");
            System.out.println(nSEE.fillInStackTrace());
        }
        //driver.close();


    }
}
