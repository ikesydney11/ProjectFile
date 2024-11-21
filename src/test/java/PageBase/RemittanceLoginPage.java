package PageBase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemittanceLoginPage extends PageBase{

    public RemittanceLoginPage(WebDriver driver)
    { super(driver);}


 @FindBy(name= "AuthenticationFG.USER_PRINCIPAL")
    public WebElement UserID;

 @FindBy(id = "Remember_UserId_Label")
    public WebDriver RememberIDBtn;

 @FindBy(id="STU_VALIDATE_CREDENTIALS")
    public WebElement LoginBtn;
 @FindBy(name = "AuthenticationFG.ACCESS_CODE" )

 public WebElement Password;

 @FindBy(id="VALIDATE_STU_CREDENTIALS_UX")
 public  WebElement LoginBtn2;

 @FindBy(id="CustomEntrustAuthUserMgmntFG.RADIO_INDEX[1]")
 public  WebElement RadioBtn;

 @FindBy(name="CustomEntrustAuthUserMgmntFG.SEC_QNS_ANS")
 public WebElement Question;
 @FindBy(id="SUBMIT_ADAPTIVE_AUTH")
 public WebElement SummitBtn;
// @FindBy(id="label_forgot_access_code")
public WebElement ForgotPassword;
 //@FindBy(name = "HREF_label_forgot_access_code")

 public void UserID(){UserID.sendKeys();}
    public void LoginBtn(){LoginBtn.click();}

    public  void Password(){Password.sendKeys();}

    public  void LoginBtn2(){LoginBtn2.click();}
    public void setRememberIDBtn(){ RadioBtn.click();}
    public void Question(){Question.sendKeys();}
    public void SummitBtn(){SummitBtn.click();}


}
