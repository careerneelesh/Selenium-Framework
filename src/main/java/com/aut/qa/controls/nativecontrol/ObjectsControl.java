package com.aut.qa.controls.nativecontrol;

import com.thoughtworks.selenium.Selenium;
import org.testng.log4testng.Logger;


public class ObjectsControl
{

    public Selenium SeleniumObject;
    public String locator;

    public static final Logger log = Logger.getLogger(ClickObject.class);

    public ObjectsControl(Selenium SeleniumObject, String locator)
    {
        this.SeleniumObject = SeleniumObject;
        this.locator = locator;
    }


    public boolean isPresent()
    {
        return SeleniumObject.isElementPresent(locator);
    }

    public boolean isVisible()
    {
        return SeleniumObject.isVisible(locator);
    }


    public void setFocus()
    {
        SeleniumObject.focus(locator);
    }

    public void throwAssertionError(String locator)
    {
        String errMessage = locator + " was not found on page or was disabled!";
        log.error(errMessage);
        throw new AssertionError(errMessage);
    }
//
//    public String getText()
//    {
//        return SeleniumObject.getText(locator);
//    }
//
////    public String getInnerHtml()
////    {
////        return SeleniumObject.getInnerHtml(locator);
////    }
//
//    public Number getXpathCount()
//    {
//        return SeleniumObject.getXpathCount(locator);
//    }

//    public String getXpathId()
//    {
//        return SeleniumObject.getXpathId(locator);
//    }
//
//    public String[] getXpaths()
//    {
//        return SeleniumObject.getXpaths(locator);
//    }
//
//    public String[] getXpathIds()
//    {
//        return SeleniumObject.getXpathIds(locator);
//    }


}
