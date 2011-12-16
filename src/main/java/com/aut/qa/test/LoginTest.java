package com.aut.qa.test;

import com.aut.qa.driver.Driver;
import com.aut.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends Driver
{
    public LoginPage loginpage;

    @Override
    public void PageSetup()
    {
        Driver.open(URL);
        Driver.windowMaximize();
        loginpage = new LoginPage(Driver);

    }

    @Test
    public void GuestUser1()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");
//        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        Reporter.log("Login page is displayed", loginpage.isdisplayed());
    }

    @Test
    public void GuestUser2()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");

    }

    @Test
    public void GuestUser3()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");

    }

    @Test
    public void GuestUser4()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");

    }

    @Test
    public void GuestUser5()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");

    }

    @Test
    public void GuestUser6()

    {
        loginpage.username.Type("kumar.neelesh@rediffmail.com");
        loginpage.password.Type("neelesh");
        loginpage.LoginButton.click();

        Assert.assertTrue(loginpage.isdisplayed(), "Login page is displayed");
        System.out.println("innnnnnnnnnnnnnnnnnnnnnnnn");

    }

}

