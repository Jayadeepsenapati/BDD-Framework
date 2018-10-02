package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features={"E:\\mindq\\gmailbdd\\src\\test\\resources\\feature\\feature1.feature","E:\\mindq\\gmailbdd\\src\\test\\resources\\feature\\feature2.feature"},
	plugin={"pretty","html:target"},monochrome=true)
	public class GmailRunnerClass
	{
	}


	