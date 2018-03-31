import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Project {
    @Test
    public void Login() {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8090/blogger");
        WebElement loginbutton = driver.findElement(By.linkText("Log In"));
        loginbutton.click();
        WebElement usernameinput = driver.findElement(By.id("j_username"));
        usernameinput.clear();
        usernameinput.sendKeys("demo");
        WebElement password = driver.findElement(By.id("j_password"));
        password.clear();
        password.sendKeys("demo");
        WebElement login = driver.findElement(By.className("ui-button-text"));
        String text = login.getText();
        if (text.equalsIgnoreCase("Login"))
            login.click();

//driver.close();
    }
}


