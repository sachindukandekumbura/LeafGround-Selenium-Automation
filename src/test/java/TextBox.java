import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class TextBox {
    WebDriver driver;
    @BeforeMethod
    public void Textboxopen()
    {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.leafground.com/input.xhtml");

    }
    @Test
    public void Textboxexample()
    {
        driver.findElement(By.id("j_idt88:name")).sendKeys("Sachindu Kandekumbura");
    }
}
