package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/*[name()='svg'][1]")
    WebElement validuser;
    @FindBy(xpath = "//span[normalize-space()='Log out @Ramkuma82374175']")
    WebElement logout;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/span")
    WebElement flogout;

    public void FinalPage() throws InterruptedException{
        validuser.click();
        Thread.sleep(2000);
        logout.click();
        Thread.sleep(2000);
        flogout.click();
        Thread.sleep(4500);
    }

}
