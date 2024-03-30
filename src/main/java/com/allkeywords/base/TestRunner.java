package com.allkeywords.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/FeatureFiles",
glue="com.allkeywords.stepsdefinition", dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests{

}
