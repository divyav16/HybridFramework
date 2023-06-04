package ResultVerification;

import CommonPages.Utils;
import org.testng.Assert;

public class ResultVerificationForHomePage extends Utils  {
    public void HomePageTitle(){
        String RegisterPageTitle = driver.getTitle();

        Assert.assertEquals(RegisterPageTitle,"nopCommerce demo store","Home page title not matched");




    }

}
