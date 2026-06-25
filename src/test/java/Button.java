import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Button {
    WebDriver driver;
    @BeforeMethod
    public void buttonOpen()
    {
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01zsn0p4vadhv6nvv7zzpwug019422340.node0");
        driver.manage().window().maximize();
    }
    @Test
    public void buttonExample()
    {
       WebElement ex = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
       ex.click();
       String expectedTitle = "Dashboard";
       String actualTitle =driver.getTitle();
       if(expectedTitle.equals(actualTitle))
       {
           System.out.println("Title is match");
       }else
       {
           System.out.println("Title is not match");
       }
    }
}
