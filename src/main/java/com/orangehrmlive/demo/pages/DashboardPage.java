package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText =  By.xpath("(//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module'])[1]");

    public String verifyDashboardText(){
        return getTextFromElement(dashboardText);
    }
}
