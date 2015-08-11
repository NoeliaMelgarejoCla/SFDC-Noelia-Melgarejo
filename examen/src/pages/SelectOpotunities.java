package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by noelia on 8/9/2015.
 */
public class SelectOpotunities {
    private WebDriver driver;
    private WebDriverWait wait;

    private String nameOportunities;
    public SelectOpotunities(WebDriver driver, String nameCampainSel){
        this.driver=driver;
        this.nameOportunities=nameCampainSel;
        String windowID = driver.getWindowHandle();
        System.out.println("main window" + windowID);
        System.out.println("");
        Set<String> setWindows = driver.getWindowHandles();
        LinkedList<String> listWindows = new LinkedList<>(setWindows);


        driver.switchTo().window(listWindows.getLast());
        driver.switchTo().frame(driver.findElement(By.id("searchFrame")));
        driver.findElement(By.id("lksrch")).sendKeys(nameCampainSel);
        driver.findElement(By.name("go")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));

        driver.findElement(By.linkText(nameCampainSel)).click();

        driver.switchTo().window(windowID);



    }


}
