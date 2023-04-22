package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {

    public WebDriver driver;
    @Test
    public void AddFavorite(){
        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam un URL specific
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();

        WebElement SearchItem = driver.findElement(By.className("input-text"));
        String SearchItemValue = "Shorts";
        SearchItem.sendKeys(SearchItemValue);
        SearchItem.submit();

        WebElement AddFavorites = driver.findElement(By.className("product-image-photo"));
        AddFavorites.click();

        WebElement ViewReview = driver.findElement(By.id("tab-label-reviews-title"));
        ViewReview.click();

        WebElement MoreInformation = driver.findElement(By.id("tab-label-additional-title"));
        MoreInformation.click();

        WebElement Details = driver.findElement(By.id("tab-label-description-title"));
        Details.click();

        WebElement SelectSize = driver.findElement(By.id("option-label-size-143-item-177"));
        SelectSize.click();

        WebElement SelectColor = driver.findElement(By.id("option-label-color-93-item-58"));
        SelectColor.click();

        WebElement AddtoCart = driver.findElement(By.id("product-addtocart-button"));
        AddtoCart.click();

        WebElement AddFavorites2 = driver.findElement(By.className("product-image-photo"));
        AddFavorites2.click();

        WebElement SelectSize2= driver.findElement(By.id("option-label-size-143-item-168"));
        SelectSize2.click();

        WebElement SelectColor2 = driver.findElement(By.id("option-label-color-93-item-49"));
        SelectColor2.click();


        WebElement AddtoCart2 = driver.findElement(By.id("product-addtocart-button"));
        AddtoCart2.click();







    }

}
