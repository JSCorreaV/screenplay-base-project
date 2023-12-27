package org.example.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/wikipedia.feature",
        glue = {"org.example.stepdefinitions"},
        tags = "@Smoke",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class WikipediaTestRunner {
}
