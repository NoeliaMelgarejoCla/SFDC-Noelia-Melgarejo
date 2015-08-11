package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteAlert {

    private WebDriver driver;
    private Alert alert;
    private WebDriverWait wait;
    public DeleteAlert(WebDriver driver) {

        this.wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

    }


}