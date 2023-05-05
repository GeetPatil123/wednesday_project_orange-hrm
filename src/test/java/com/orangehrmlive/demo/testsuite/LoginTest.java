package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    DashboardPage dashboardPage = new DashboardPage();
   @Test
    public void verifyUserShouldLoginSuccessFully() {

        loginPage.sendTextToUsernameField("Admin");
        loginPage.sendTextToPasswordField("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        String actualText = dashboardPage.verifyDashboardText();
        Assert.assertEquals(expectedText, actualText, "Text not found");
    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        homePage.displayLogoHome();
    }
    @Test
    public void  VerifyUserShouldLogOutSuccessFully(){
        loginPage.loginToApplication("Admin", "admin123");
        homePage.userProfileLogoClick();
        homePage.MouseHoverLogo();
    }

}
