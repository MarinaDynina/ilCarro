package com.qa.ilCarro.fw;

import com.qa.ilCarro.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void clickSignUpButton() {
        waitForElementLocatedAndClick(By.cssSelector("[href='/signup']"), 30);
    }

    public void fillRegistrationForm(UserData user) throws InterruptedException {
        type(By.cssSelector("#first_name"), user.getfName());
        type(By.cssSelector("#second_name"), user.getlName());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
        waitForElementLocatedAndClick(By.cssSelector("#check_policy"), 20);
    }

    public void confirmRegistration() {
        waitForElementLocatedAndClick(By.cssSelector("[type=submit]"), 20);
    }
}
