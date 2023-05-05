package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AdduserPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AdduserPage addUserPage = new AdduserPage();

    @Test
    public void adminShouldAddUserSuccessFully() {
        loginPage.loginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        viewSystemUsersPage.clickAddButton();
        viewSystemUsersPage.AddUser();
        viewSystemUsersPage.selectAdminRole();
        viewSystemUsersPage.enterEmp();
        viewSystemUsersPage.enterUser();
        viewSystemUsersPage.selectDisableOption();
        viewSystemUsersPage.enterPass();
        viewSystemUsersPage.enterConfirmPass();
        viewSystemUsersPage.clickOnSaveButton();
    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        loginPage.loginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.selectUserRole();
        addUserPage.selectStatusEnable();
        addUserPage.clickOnSearchButton();
        addUserPage.verifyResultList();
        addUserPage.clickOnCheckBox();
        addUserPage.clickOnDeleteButton();
        addUserPage.popUpClick();
        addUserPage.verifyMessageCheck();
    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.loginToApplication("Admin", "admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.enterUser();
        addUserPage.selectUserRole();
        addUserPage.selectStatusDisable();
        addUserPage.searchButtonDelete();
        addUserPage.verifyNoOfRecordsFound();
    }

}
