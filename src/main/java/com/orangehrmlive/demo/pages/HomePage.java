package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By displayLogo = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By UserProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/i[1]");
    By MouseHover = By.xpath("//a[contains(text(),'Logout')]");
    By pim = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
    By leave = By.xpath("//a[normalize-space()='']");
    By dashboard = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]");

    public String displayLogoHome(){
        return getTextFromElement(displayLogo);
    }
    public void userProfileLogoClick() {
        clickOnElement(UserProfileLogo);
    }
    public void MouseHoverLogo(){
        mouseHoverToElementAndClick(MouseHover);
    }
    public void clickPim(){
        clickOnElement(pim);
    }
    public void clickLeave(){
        clickOnElement(leave);
    }
    public void clickDashboard(){
        clickOnElement(dashboard);
    }

}
