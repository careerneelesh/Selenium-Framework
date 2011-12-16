package com.aut.qa.controls;

import com.aut.qa.controls.nativecontrol.ObjectsControl;
import com.thoughtworks.selenium.Selenium;

public class WebObject extends ObjectsControl
{
    public WebObject(Selenium SeleniumObject, String locator)
    {
        super(SeleniumObject, locator);
    }

    public void click()
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.click(locator);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void doubleclick()
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.doubleClick(locator);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void doubleclickat(String coordinates)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.doubleClickAt(locator, coordinates);
        }
        else {
            throwAssertionError(locator);
        }
    }

    public void clickAt(String coordinates)
    {
        if (isPresent() && isVisible()) {
            SeleniumObject.clickAt(locator, coordinates);
        }
        else {
            throwAssertionError(locator);
        }
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

    public void setFocus()
    {
        SeleniumObject.focus(locator);
    }

    public void selectFrame()
    {
        SeleniumObject.selectFrame(locator);
    }


}
