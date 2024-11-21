package TestCases;

import PageBase.RemittanceLoginPage;
import TestBase.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pensionRemittance extends TestBase {
    @BeforeTest
    public void stackReporter() {

        initializeReport();
    }

    @Test(priority = 1)
    public void LoginTest(){

        RemittanceLoginPage remittanceLoginPage = new RemittanceLoginPage(driver);
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        //String className = new Exception().getStackTrace()[0].getClassName();
        test = extent.createTest(methodName, "Verify that user cannot successfully login with blank credentials");
        test.log(Status.INFO, "Starting browser and open log in page");
        test.assignCategory("Pension Remittance");
        NavigateToUrl("http://10.100.4.23:9083/obng/AuthenticationController?__START_TRAN_FLAG__=Y&FORMSGROUP_ID__=AuthenticationFG&__EVENT_ID__=LOAD&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=NG&LANGUAGE_ID=001");
        remittanceLoginPage.UserID.sendKeys("");
        remittanceLoginPage.LoginBtn();
        sleep(10);}

       @Test(priority = 2)

            public void LoginTest2(){

            RemittanceLoginPage remittanceLoginPage = new RemittanceLoginPage(driver);
            String methodName = new Exception().getStackTrace()[0].getMethodName();
            //String className = new Exception().getStackTrace()[0].getClassName();
            test = extent.createTest(methodName, "Verify that user cannot successfully login with invalid credentials");
            test.log(Status.INFO, "Starting browser and open log in page");
            test.assignCategory("Pension Remittance");
            //NavigateToUrl("http://10.100.4.23:9083/obng/AuthenticationController?__START_TRAN_FLAG__=Y&FORMSGROUP_ID__=AuthenticationFG&__EVENT_ID__=LOAD&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=NG&LANGUAGE_ID=001");
            remittanceLoginPage.UserID.sendKeys("OCHTEST");
            remittanceLoginPage.LoginBtn();
            remittanceLoginPage.Password.sendKeys("Uba@4567");
            remittanceLoginPage.LoginBtn2();
            sleep(10);}

    @Test(priority = 3)

    public void LoginTest3(){

        RemittanceLoginPage remittanceLoginPage = new RemittanceLoginPage(driver);
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        //String className = new Exception().getStackTrace()[0].getClassName();
        test = extent.createTest(methodName, "Verify that user can  login  to security question page with valid credentials");
        test.log(Status.INFO, "Starting browser and open log in page");
        test.assignCategory("Pension Remittance");
        NavigateToUrl("http://10.100.4.23:9083/obng/AuthenticationController?__START_TRAN_FLAG__=Y&FORMSGROUP_ID__=AuthenticationFG&__EVENT_ID__=LOAD&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=NG&LANGUAGE_ID=001");
        remittanceLoginPage.UserID.sendKeys("OCHTEST.ANJOLA");
        remittanceLoginPage.LoginBtn();
        remittanceLoginPage.Password.sendKeys("Uba@45678");
        remittanceLoginPage.LoginBtn2();
        sleep(10);}

    @Test(priority = 4)

    public void SecurityQuestion(){
        RemittanceLoginPage remittanceLoginPage = new RemittanceLoginPage(driver);
        String methodName = new Exception().getStackTrace()[0].getMethodName();
       // String className  = new Exception().getStackTrace()[0].getClassName();
        test = extent.createTest(methodName,"Verify that user can select a security question to continue.");
        test.log(Status.INFO, "Starting browser and open log in page");
        test.assignCategory("Pension Remittance");
        //remittanceLoginPage.RadioBtn();
        remittanceLoginPage.Question.sendKeys("String");
        remittanceLoginPage.SummitBtn();

    }
}
