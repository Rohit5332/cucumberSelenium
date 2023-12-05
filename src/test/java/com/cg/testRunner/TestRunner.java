package com.cg.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/register.feature", glue = "com.cg.stepdef", dryRun = false)
public class TestRunner {

}