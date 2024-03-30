package com.allkeywords.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/FeatureFiles",
glue="com.allkeywords.stepsdefinition", dryRun = false,  plugin =
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class TestRunner extends AbstractTestNGCucumberTests{

}
