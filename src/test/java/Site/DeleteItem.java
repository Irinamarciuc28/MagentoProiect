package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.Callable;

public class DeleteItem {
    public WebDriver driver;

    @Test
    public void metodaDeleteItem(){
        //Deschidem un browser de chrome

        driver =  new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();

        // wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement Email = driver.findElement(By.id("email"));
        String EmailValue ="marciuc.irina@yahoo.com";
        Email.sendKeys(EmailValue);


        WebElement Password = driver.findElement(By.id("pass"));
        String PasswordValue="Ady1988.";
        Password.sendKeys(PasswordValue);

        WebElement SignIn = driver.findElement(By.id("send2"));
        SignIn.click();

        WebElement NewSearch = driver.findElement(By.id("search"));
        String NewSearchValue= "Shorts";
        NewSearch.sendKeys(NewSearchValue);
        NewSearch.submit();

        WebElement AddFavorites = driver.findElement(By.className("product-image-photo"));
        AddFavorites.click();

        WebElement SelectSize = driver.findElement(By.id("option-label-size-143-item-177"));
        SelectSize.click();

        WebElement SelectColor= driver.findElement(By.id("option-label-color-93-item-50"));
        SelectColor.click();

        WebElement Select = driver.findElement(By.id("product-addtocart-button"));
        Select.click();

        // wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://magento.softwaretestingboard.com/checkout/cart/");

        WebElement DeleteItem = driver.findElement(By.linkText("Remove item"));
        DeleteItem.click();





    }
        }



