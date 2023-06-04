import CommonPages.BrowserSelector;
import CommonPages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    @Before
    public void openBrowser(){
        browserSelector.openSelectorBrowser();

    }
    @After
    public void closeBrowser(){
        driver.quit();


    }

}
