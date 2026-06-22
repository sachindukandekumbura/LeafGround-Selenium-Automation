import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class LinkExample {
      WebDriver driver;
      @BeforeMethod
       public void LinkOpen()
       {
         driver =new ChromeDriver();
         driver.get("https://www.leafground.com/link.xhtml");
       }

}
