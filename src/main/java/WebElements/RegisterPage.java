package WebElements;

import CommonPages.LoadProperty;
import CommonPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();

    By _clickOnRegisterLink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");

    By _Gender = By.id("gender-female");
    By _FirstName = By.id("FirstName");
    By _LastName = By.id("LastName");
    By _DateOfBirthday = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By _DateOfBirthdayMonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By _DateOfBirthYear = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By _Email = By.xpath("//*[@id=\"Email\"]");
    By _CompanyName = By.id("Company");
    By _Password = By.xpath("//*[@id=\"Password\"]");
    By _ConfirmPassword = By.id("ConfirmPassword");
    By _clickOnRegisterButton = By.xpath("//*[@id=\"register-button\"]");

    public void clickOnRegisterLink(){
        doClick(_clickOnRegisterLink);

        }

     public void doRegister(){
         doSendKey(_Gender,loadProperty.getProperty("Gender"));
         doSendKey(_FirstName,loadProperty.getProperty("FirstName"));
         doSendKey(_LastName,loadProperty.getProperty("LastName"));
         doSendKey(_DateOfBirthday,loadProperty.getProperty("DateOfBirthday"));
         doSendKey(_DateOfBirthdayMonth,loadProperty.getProperty("DateOfBirthMonth"));
         doSendKey(_DateOfBirthYear,loadProperty.getProperty("DateOfBirthYear"));
         doSendKey(_Email,loadProperty.getProperty("Email"));
         doSendKey(_CompanyName,loadProperty.getProperty("CompanyName"));
         doSendKey(_Password,loadProperty.getProperty("Password"));
         doSendKey(_ConfirmPassword,loadProperty.getProperty("ConfirmPassword"));
         doClick(_clickOnRegisterButton);
}

}
