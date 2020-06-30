package com.qa.ilCarro.tests;

import com.qa.ilCarro.model.UserData;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationFromHeader() throws InterruptedException {
        app.getUser().clickSignUpButton();
        app.getUser().fillRegistrationForm(new UserData()
                .withfName("Elizaveta")
                .withlName("Miloslavskaya")
                .withEmail("miloslavskaya@gmail.com")
                .withPassword("123456Aa"));
        Thread.sleep(5000);
        app.getUser().confirmRegistration();
    }

    }
