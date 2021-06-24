import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
    public static void main ( String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\Documents\\SD\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\facebook.com");
        driver.manage().window().maximize();
        WebElement day_d = driver.findElement(By.id("day"));
        Select oSelecet = new Select(day_d);
        Thread.sleep(3000);
        oSelecet.selectByIndex(6);
        WebElement month_m = driver.findElement(By.id("month"));
        Select month_m1 = new Select(month_m);
        Thread.sleep(3000);
        oSelecet.selectByVisibleText("Jul");
        WebElement  year_y = driver.findElement(By.id("year"));
        Select year_y1 = new Select(year_y);
        Thread.sleep(3000);
        oSelecet.selectByValue("2000");



    }
}
