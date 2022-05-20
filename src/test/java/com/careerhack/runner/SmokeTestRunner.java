package com.careerhack.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="Features", //connected Feature folder.  initiate feature
		glue="com.careerhack.steps" //connected careerhack.steps package with Feature folder
		
		)



public class SmokeTestRunner extends AbstractTestNGCucumberTests{

}
