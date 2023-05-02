package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccount {

    public WebDriver driver;//variabila

    @Test
    public void AccessSite(){
        //setam driverul pentru browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");

        //Deschidem un browser de Chrome
        driver = new ChromeDriver();

        //Accesam un URL specific
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        driver.manage().window().maximize();

        WebElement FirstName = driver.findElement(By.id("firstname"));
        String FirstNameValue = "Ioana";
        FirstName.sendKeys(FirstNameValue);

        WebElement LastName = driver.findElement(By.id("lastname"));
        String LastNameValue = "Marciuc";
        LastName.sendKeys(LastNameValue);


        WebElement CheckBox = driver.findElement(By.id("is_subscribed"));
        CheckBox.click();

        WebElement EmailAddress = driver.findElement(By.id("email_address"));
        String EmailAddressValue = "marciuc.ioana@yahoo.com";
        EmailAddress.sendKeys(EmailAddressValue);

        WebElement Password = driver.findElement(By.id("password"));
        String PasswordValue="Ioana1988..";
        Password.sendKeys(PasswordValue);

        WebElement PasswordConfirm = driver.findElement(By.id("password-confirmation"));
        String PasswordConfirmValue="Ioana1988..";
        PasswordConfirm.sendKeys(PasswordConfirmValue);

        WebElement CreateAccount = driver.findElement(By.className("submit"));
        CreateAccount.click();









    }
}
