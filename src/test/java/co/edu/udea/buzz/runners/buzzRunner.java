package co.edu.udea.buzz.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buzz.feature",
        glue = "co.edu.udea.buzz.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class buzzRunner {}