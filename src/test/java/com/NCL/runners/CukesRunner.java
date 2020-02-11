package com.NCL.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@login",
		features="src/test/resources/features",
		glue = "com/NCL/step_definitions",
		dryRun = false
			)
public class CukesRunner {

}
