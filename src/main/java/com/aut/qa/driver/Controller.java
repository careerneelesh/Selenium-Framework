//package com.aut.qa.driver;
//
//import com.thoughtworks.selenium.Selenium;
//import org.openqa.selenium.server.RemoteControlConfiguration;
//import org.openqa.selenium.server.SeleniumServer;
//import org.testng.annotations.BeforeClass;
//
//import java.net.BindException;
//import java.net.ServerSocket;
//
//public class Controller
//{
//    public SeleniumServer server;
//
//    @BeforeClass
//    public void StartServer()
//            throws Exception
//    {
//
//        try {
//
//            ServerSocket serverSocket = new ServerSocket(RemoteControlConfiguration.);
//            serverSocket.close();
//
//            //Server not up, start it
//            try {
//                RemoteControlConfiguration rcc = new RemoteControlConfiguration();
//                rcc.setPort(RemoteControlConfiguration.DEFAULT_PORT);
//                server = new SeleniumServer(false, rcc);
//            }
//            catch (Exception e) {
//                System.err.println("Could not create Selenium Server because of: "+ e.getMessage());
//                e.printStackTrace();
//            }
//            try {
//                server.start();
//                System.out.println("Server started");
//            }
//            catch (Exception e) {
//                System.err.println("Could not start Selenium Server because of: "
//                        + e.getMessage());
//                e.printStackTrace();
//            }
//        }
//        catch (BindException e) {
//            System.out.println("Selenium server is already running");
//        }
//    }
//
//    public void stopSeleniumServer(Selenium selenium)
//    {
//        selenium.stop();
//        if (server != null) {
//        }
//        {
//            try {
//                selenium.shutDownSeleniumServer();
//                server.stop();
//                server = null;
//            }
//            catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
