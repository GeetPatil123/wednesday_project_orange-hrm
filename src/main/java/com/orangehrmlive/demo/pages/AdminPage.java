package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By userManagement = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']//span[@class='oxd-topbar-body-nav-tab-item']");
    By job = By.xpath("//header/div[2]/nav[1]/ul[1]/li[2]/span[1]");
    By organization = By.xpath("//div[@class='oxd-topbar-body']//li[1]//span[1]");

    public void clickUseManagement(){
        clickOnElement(userManagement);
    }

    public void clickOnJob(){
        clickOnElement(job);
    }

    public void clickOnOrganization(){
        clickOnElement(organization);
    }

}
