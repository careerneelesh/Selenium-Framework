package com.aut.qa.controls;

import com.thoughtworks.selenium.Selenium;

public class DropDown extends WebObject
{
    public DropDown(Selenium SeleniumObject, String locator)
    {
        super(SeleniumObject, locator);
    }

    public void select(String OptLocator)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.select(locator, OptLocator);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void type(String value)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.type(locator, value);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void typeKeys(String value)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.typeKeys(locator, value);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void setFocus()
    {
        SeleniumObject.focus(locator);
    }

}

