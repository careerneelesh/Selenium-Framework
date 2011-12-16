package com.aut.qa.driver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import java.io.IOException;

public abstract class Driver
{
    public Selenium Driver;
    public String URL;
    public String browser;
    public static final Logger log = Logger.getLogger(Driver.class);

    @BeforeClass
    @Parameters({"host", "port", "browser", "url", "execSpeed", "pagetimeout"})
    public void Initialize(
            @Optional("localhost") String host,
            @Optional("44") Integer port,
            @Optional("*iexplore") String browser,
            @Optional("http://www.google.com") String url,
            @Optional("0") Long execSpeed,
            @Optional("30000") Long pagetimeout
    )

    {
        this.URL = url;
        this.browser = browser;
        Driver = new DefaultSelenium(host, port, browser, URL);
        Driver.start();
//        Driver.setSpeed(execSpeed.toString());
        Driver.setTimeout(pagetimeout.toString());
        PageSetup();
    }

    @AfterClass(alwaysRun = true)
    public void Close()
            throws IOException
    {
        Driver.stop();
//        killBrowser();

    }

    public abstract void PageSetup();

    public void killBrowser()
            throws IOException
    {
        if (browser.equalsIgnoreCase("firefox")) {
            Runtime.getRuntime().exec("c:\\Program Files\\Mozilla Firefox\\firefox.exe").destroy();
        }
        else if (browser.equalsIgnoreCase("iexplore")) {
            Runtime.getRuntime().exec("c:\\Program Files\\Internet Explorer\\iexplore.exe").destroy();
        }

    }

}




