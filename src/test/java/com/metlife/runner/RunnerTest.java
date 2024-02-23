package com.metlife.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features/ixigo.feature"},
        glue = {"com.metlife.ixigo_steps"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {


}
