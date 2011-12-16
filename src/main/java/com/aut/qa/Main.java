package com.aut.qa;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Selenium Integration test launcher
 */
public class Main
{

    private final static Class<?>[] TEST_CLASSES = new Class[]{};

    public static void main(String[] args)
    {

        // look for configuration files in etc/testng*.xml
        List<String> testSuites = new ArrayList<String>();
        File configDir = new File("src\\config");
        if (configDir.exists() && configDir.isDirectory()) {

            File[] testSuiteFiles = configDir.listFiles();
            for (File file : testSuiteFiles) {
                String fileName = file.getName();
                if (file.isFile() && fileName.startsWith("testng") && fileName.endsWith(".xml")) {
                    testSuites.add(file.getAbsolutePath());

                }
            }
        }


        // kick off this test suite programatically
        TestNG testng = new TestNG();
        testng.setVerbose(5);
        if (testSuites != null && !testSuites.isEmpty()) {
            testng.setTestSuites(testSuites);
        }
        else {
            testng.setDefaultSuiteName("SeleniumTests");
            testng.setTestClasses(TEST_CLASSES);
        }
        // configurable via testng.xml or always hardcode?
        TestListenerAdapter tla = new TestListenerAdapter();

        testng.addListener(tla);
        testng.setOutputDirectory("TestResults" + File.separatorChar + "test-reports");
        testng.run();

        System.exit(testng.getStatus());
    }
}