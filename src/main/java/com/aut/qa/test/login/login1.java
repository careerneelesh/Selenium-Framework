package com.aut.qa.test.login;

import com.aut.qa.driver.Driver;
import org.testng.annotations.Test;

public class login1 extends Driver
{
    // Instantiate the pages
    @Override
    public void PageSetup()
    {

    }

    @Test
    public void login()
    {
        Driver.open("http://www.google.com");
    }
}
