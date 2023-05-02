package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInErr{

    public WebDriver driver;


    @Test
    public void metodaSignInErr(){
        //Deschidem un browser de chrome

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Accesam un URL specific


        driver.get("https://magento.softwaretestingboard.com/customer/account/login");

        WebElement Email = driver.findElement(By.id("email"));
        String EmailValue ="marciuc.irina@yahoo.com";
        Email.sendKeys(EmailValue);


        WebElement Password = driver.findElement(By.id("pass"));
        String PasswordValue="mfjedmfgjmgfye";
        Password.sendKeys(PasswordValue);

        WebElement SignIn = driver.findElement(By.id("send2"));
        SignIn.click();
    }

}
