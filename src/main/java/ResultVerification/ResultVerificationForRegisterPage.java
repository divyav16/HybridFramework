package ResultVerification;

import CommonPages.Utils;
import org.testng.Assert;

public class ResultVerificationForRegisterPage extends Utils {

    public void registerPageTitle(){
        String RegisterPageTitle = driver.getTitle();
        Assert.assertEquals(RegisterPageTitle,"nopCommerce demo store. Register","Register Page title not matched");


    }
}
