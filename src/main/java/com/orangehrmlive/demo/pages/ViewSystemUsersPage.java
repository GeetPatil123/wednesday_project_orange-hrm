package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By adminClick = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    By verifySystemUserText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By verifyAddUser = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By selectAdminDrop = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By selectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By enterEmpName = By.xpath("//input[@placeholder='Type for hints...']");
    By enterEmpName1 = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");
    By enterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]");
    By selectStatus = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By selectDisable = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By enterPassword = By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By enterConfirmPassword = By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By clickOnSave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public void clickAdminLink() {
        clickOnElement(adminClick);
    }

    public String getSystemUserText() {
        return getTextFromElement(verifySystemUserText);
    }

    public void clickAddButton() {
        clickOnElement(addButton);
    }

    public String AddUser() {
        return getTextFromElement(verifyAddUser);
    }

    public void selectAdminRole(){
        clickOnElement(selectAdminDrop);
        clickOnElement(selectAdmin);
    }

    public void enterEmp(){
        sendTextToElement(enterEmpName, "G");
        clickOnElement(enterEmpName1);
    }

    public void enterUser() {
        sendTextToElement(enterUsername, "Harry");
    }

    public void selectDisableOption() {
        clickOnElement(selectStatus);
        clickOnElement(selectDisable);
       }

    public void enterPass() {
        sendTextToElement(enterPassword, "g123");
    }

    public void enterConfirmPass() {
        sendTextToElement(enterConfirmPassword, "harry123");
    }

    public void clickOnSaveButton() {
        clickOnElement(clickOnSave);
    }
}
