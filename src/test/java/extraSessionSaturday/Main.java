package extraSessionSaturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Main {

    public static void main(String[] args) throws InterruptedException {


        String url = "https://www.youtube.com/";
        System.setProperty("webdriver.chrome.driver", "/Users/Work/Desktop/B7-Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement serchField = driver.findElement(By.id("search-input"));
        serchField.sendKeys("Tesla");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
