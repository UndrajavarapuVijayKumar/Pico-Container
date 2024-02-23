package com.metlife.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features/demo.feature"},
        glue = {"com.metlife.steps"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
