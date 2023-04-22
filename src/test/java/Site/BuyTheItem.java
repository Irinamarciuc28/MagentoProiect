package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BuyTheItem {

    public WebDriver driver;
    @Test
    public void BuyTheItem(){

        driver =  new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        driver.manage().window().maximize();

        //de facut wait
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
        String NewSearchValue= "Pants";
        NewSearch.sendKeys(NewSearchValue);
        NewSearch.submit();

        WebElement AddFavorites = driver.findElement(By.className("product-image-photo"));
        AddFavorites.click();

        WebElement SelectSize = driver.findElement(By.id("option-label-size-143-item-177"));
        SelectSize.click();

        WebElement SelectColor= driver.findElement(By.id("option-label-color-93-item-57"));
        SelectColor.click();

        WebElement Select = driver.findElement(By.id("product-addtocart-button"));
        Select.click();


        driver.get("https://magento.softwaretestingboard.com/checkout/cart/");


        WebElement Select2= driver.findElement(By.className("counter-number"));
        Select2.click();

        WebElement TOBuy= driver.findElement(By.className("checkout-index-index page-layout-checkout"));
        TOBuy.click();






    }
}
