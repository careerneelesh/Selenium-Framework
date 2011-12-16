package com.aut.qa.controls;

import com.aut.qa.controls.nativecontrol.ObjectsControl;
import com.thoughtworks.selenium.Selenium;

public class TextField extends ObjectsControl
{

    public TextField(Selenium SeleniumObject, String locator)
    {
        super(SeleniumObject, locator);
    }

    public void Type(String value)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.type(locator, value);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void TypeKeys(String value)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.typeKeys(locator, value);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public String getText()
    {
        return SeleniumObject.getText(locator);
    }

}
