package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Carlos Gonzales on 7/27/2015.
 */
public class MainApp {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainApp(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public TopBar goToTopBar() {
        return new TopBar(driver);
    }

//    public LeftMenu goToLeftMenu() {
//        return new LeftMenu(driver);
//    }
}
