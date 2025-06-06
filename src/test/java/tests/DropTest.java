package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DroppablePage;
import pages.HomePage;

public class DropTest extends BaseTest {

    @Test
    public void droppableTest() {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        homePage.goToDesiredMenu("Interactions");
        CommonPage commonPage = new CommonPage(driver);
        commonPage.isPageLoaded();
        commonPage.goToDesiredSubMenu("Droppable");
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.isPageLoaded();
        droppablePage.pickAndDropElement();
//        closeBrowser();
    }


    //facem o metoda care deschide un browser;
//    public void openBrowser() {
//        driver = new ChromeDriver();
//        // navigam catre pagine website-ului
//        driver.get("https://demoqa.com/");
//        //facem fereastra browser-ului maximize
//        driver.manage().window().maximize();
//    }
 /*
    //facem o metoda care alege un meniu;
    public void chooseMenu() {
        //identificam meniul dorit si facem click pe el;
        WebElement alertsWindowsAndFramesMenu = driver.findElement(By.xpath("//h5[text()='Interactions']"));
        //actionam butonul pe meniul de mai sus;
        // facem scroll pana in dreptul elementului pe care vrem sa actionam;
        scrollIntoElement(alertsWindowsAndFramesMenu);
        alertsWindowsAndFramesMenu.click();
    }
    //facem o metoda care sa faca scroll;

    public void scrollIntoElement(WebElement alertsMenu) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", alertsMenu);
    }

    //facem o metoda care sa selecteze submeniul;
    public void chooseSubMenu() {
        //identificam submeniul dorit si facem click pe el;
        WebElement alertsSubMenu = driver.findElement(By.xpath("//span[text()='Droppable']"));
        alertsSubMenu.click();
    }
//    public void closeBrowser() {
//        driver.quit();
//    }

  */

}

