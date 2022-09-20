package extraSessionSaturday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Main {

    public static void main(String[] args) throws InterruptedException {


        String url = "https://www.youtube.com/";
        System.setProperty("webdriver.chrome.driver", "/Users/Work/Desktop/B7-Selenium/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get(url);


        Thread.sleep(3000);
        driver.quit();
    }
}
