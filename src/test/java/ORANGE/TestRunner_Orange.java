package ORANGE;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/ORANGE/ORANGE_1.feature",glue = "ORANGE",
        plugin = {"pretty", "teamcity","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner_Orange extends AbstractTestNGCucumberTests {
}
