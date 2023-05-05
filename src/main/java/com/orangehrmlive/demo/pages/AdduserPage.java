package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class  AdduserPage extends Utility {

    By userName = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]");
    By userRollSelect = By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i");
    By selectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By statusSelect = By.xpath("//div[@class='oxd-form-row']/div/div[4]/div/div[2]/div/div");
    By selectDisable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By selectEnable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By clickSearch = By.xpath("/button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By verifyResults = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By clickOnCheckBox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]");
    By clickDelete = By.xpath("//div[@class='oxd-table-cell-actions']/button[1]/i[1]");
    By popUp = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]");
    By verifyMessage = By.xpath("//div[@class='orangehrm-paper-container']/div[2]/div[1]/span[1]");
    By searchButton = By.xpath("//div[@class='oxd-table-filter-area']/form[1]/div[2]/button[2]");
    By verifyNoOfRecords = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");

    public void enterUser() {
        sendTextToElement(userName, "GeetPatel");
    }

    public void selectUserRole() {
        clickOnElement(userRollSelect);
        clickOnElement(selectAdmin);
    }

    public void selectStatusDisable() {
        clickOnElement(statusSelect);
        clickOnElement(selectDisable);
    }

    public void selectStatusEnable() {
        clickOnElement(statusSelect);
        clickOnElement(selectEnable);
    }

    public void clickOnSearchButton() {
        clickOnElement(clickSearch);
    }

    public String verifyResultList() {
        return getTextFromElement(verifyResults);
    }

    public void clickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }

    public void clickOnDeleteButton(){
        clickOnElement(clickDelete);
    }

    public void popUpClick(){
        clickOnElement(popUp);
    }

    public void verifyMessageCheck(){
        clickOnElement(verifyMessage);
    }

    public void searchButtonDelete(){
        clickOnElement(searchButton);
    }
    public String verifyNoOfRecordsFound(){
        return getTextFromElement(verifyNoOfRecords);
    }
}

