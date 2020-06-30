package com.qa.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSite extends TestBase {

    @Test
    public void isSiteOpenOnSearchPage () {
String currentURL = app.getSession().getURL();
        Assert.assertEquals(currentURL, "https://ilcarro-dev-v1.firebaseapp.com/");
    }
}
