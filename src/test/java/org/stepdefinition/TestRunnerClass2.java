package org.stepdefinition;//challenge tagged hooks


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources",
glue="org.stepdefinition",
monochrome= true,
strict = true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
tags= {"@Regression"})

public class TestRunnerClass2 {

}
