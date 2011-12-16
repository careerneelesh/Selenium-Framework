package com.aut.qa.controls;

import com.aut.qa.controls.nativecontrol.ClickObject;
import com.thoughtworks.selenium.Selenium;


public class Button extends ClickObject
{

    public Button(Selenium SeleniumObject, String locator)
    {
        super(SeleniumObject, locator);
    }

    @Override
    public void click()
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.click(locator);
        }
        else {
            throwAssertionError(locator);
        }
    }

    @Override
    public void clickAt(String coordinates)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.clickAt(locator, coordinates);
        }
        else {
            throwAssertionError(locator);
        }
    }

}
