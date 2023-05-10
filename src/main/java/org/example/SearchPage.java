package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "//a[@aria-label='Search and explore']")
    WebElement explore;
    @FindBy(xpath = "//input[@placeholder='Search Twitter']")
    WebElement entertext;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
    WebElement person;


    public void ExplorePage() throws InterruptedException{
        explore.click();
        Thread.sleep(2000);
        entertext.sendKeys("dhoni");
        Thread.sleep(2000);
        person.click();
        Thread.sleep(4000);


    }
}
