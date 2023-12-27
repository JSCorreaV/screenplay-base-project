package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.example.tasks.LookForInformation;
import org.example.tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class WikipediaSteps {

    private static final String JOHN = "John";


    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that John is on Wikipedia")
    public void onWikipedia() {
        System.out.println("====================Given");
        theActorCalled(JOHN).wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("he search for {string}")
    public void searchFor(String keyword) {
        System.out.println("====================When");
        theActorInTheSpotlight().attemptsTo(LookForInformation.about(keyword));

    }

    @Then("he should see all info about {string}")
    public void seeColombiaArticle(String keyword) {
        System.out.println("====================Then");
        theActorInTheSpotlight().attemptsTo(Ensure.that(TheWebPage.title()).containsIgnoringCase(keyword));
    }

    @After
    public void tearDown() {
    }

}
