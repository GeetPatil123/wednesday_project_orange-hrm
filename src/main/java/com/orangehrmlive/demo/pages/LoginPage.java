package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameFile = By.xpath("//input[@placeholder='Username']");
    By passwordFile = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[@type='submit']");
    By loginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");

    public void sendTextToUsernameField(String userName){
        sendTextToElement(userNameFile, userName);
    }

    public void sendTextToPasswordField(String password){
        sendTextToElement(passwordFile, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyLoginText(){
        return getTextFromElement(loginText);
    }

    public void loginToApplication(String username, String password) {
        sendTextToUsernameField(username);
        sendTextToPasswordField(password);
        clickOnLoginButton();
    }
}
