package com.automationpractice.reto.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automationPractice.feature",
                 glue = "com.automationpractice.reto.stepdefinitions",
                 snippets = SnippetType.CAMELCASE,
                  tags = "@Stories")
public class AutomationPracticeRunner {
}
