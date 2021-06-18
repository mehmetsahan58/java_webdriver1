package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests1 {

    private WebDriver driver;

    public void setUp () {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        System.out.println (driver.getTitle());

//        driver.findElement(By.cssSelector("a[href='/shifting_content']")).click();
//        driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")).click();

        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println ("Number of menu items: " + menuItems.size());
        for( WebElement menu : menuItems) {
            System.out.println(menu.getText());
        }

    }

    public static void main (String args [] ) {

        BaseTests1 test = new BaseTests1();

        test.setUp();
    }
}
