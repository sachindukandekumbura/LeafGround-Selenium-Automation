import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Sachindu");

        WebElement city =driver.findElement(By.id("j_idt88:j_idt91"));
        city.sendKeys("Kandy");

        boolean enable = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("This value is :" + enable);

        WebElement clearText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();
       WebElement Retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
       String ret = Retrieve.getAttribute("value");
        System.out.println("Retrive value is" + ret);

    }
}
