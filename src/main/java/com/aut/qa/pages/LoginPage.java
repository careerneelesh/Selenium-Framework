package com.aut.qa.pages;

import com.aut.qa.common.PageObject;
import com.aut.qa.controls.Button;
import com.aut.qa.controls.TextField;
import com.thoughtworks.selenium.Selenium;

public class LoginPage implements PageObject
{
    public TextField username;
    public TextField password;
    public Button LoginButton;

    public LoginPage(Selenium SeleniumObj)
    {
        username = new TextField(SeleniumObj, "//input[@id='login_hidden']");
        password = new TextField(SeleniumObj, "//input[@id='login_form_passwd']");
        LoginButton = new Button(SeleniumObj, "//a[@id='login_button_credentials']");
    }

    public boolean isdisplayed()
    {
        return (username.isPresent()
                && password.isPresent()
                && LoginButton.isPresent());
    }


}
