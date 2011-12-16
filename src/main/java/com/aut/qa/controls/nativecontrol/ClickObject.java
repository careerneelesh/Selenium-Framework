package com.aut.qa.controls.nativecontrol;

import com.thoughtworks.selenium.Selenium;

public class ClickObject extends ObjectsControl
{
//    public static final Logger log = Logger.getLogger(ClickObject.class);

    public ClickObject(Selenium SeleniumObject, String locator)
    {
        super(SeleniumObject, locator);
    }


    public void click()
    {
        SeleniumObject.click(locator);
    }

    public void clickAt(String coordinates)
    {
        SeleniumObject.clickAt(locator, coordinates);

    }

}
