package PageBase;
import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase extends TestBase {
 public WebDriver driver;
   public PageBase(WebDriver lDriver){
       super();

       driver =  lDriver;
       PageFactory.initElements(driver, this);
   }


    public void waitForElement(WebElement element){

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
      wait.until(ExpectedConditions.visibilityOf(element));

  }

  public void click(WebElement element){
       waitForElement(element);
       element.click();
  }

   public void enterText(WebElement element, String message){
        waitForElement(element);
        element.sendKeys(message);

   }




}
