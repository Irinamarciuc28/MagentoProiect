package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {

    public WebDriver driver;
    @Test
    public void metodaSignIn(){
        //Deschidem un browser de chrome

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Accesam un URL specific


        driver.get("https://magento.softwaretestingboard.com/customer/account/login");

        WebElement Email = driver.findElement(By.id("email"));
        String EmailValue ="marciuc.irina@yahoo.com";
        Email.sendKeys(EmailValue);


        WebElement Password = driver.findElement(By.id("pass"));
        String PasswordValue="Ady1988.";
        Password.sendKeys(PasswordValue);

        WebElement SignIn = driver.findElement(By.id("send2"));
        SignIn.click();

        //declaram elementul Search
        WebElement SearchItem = driver.findElement(By.id("search"));
        SearchItem.sendKeys("SHIRT");
        SearchItem.submit();

    }
}
