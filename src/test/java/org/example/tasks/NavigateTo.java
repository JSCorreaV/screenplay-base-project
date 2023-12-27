package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.example.exceptions.WikipediaHomePageError;
import org.example.userinterface.WikipediaHomePage;

import static org.example.exceptions.WikipediaHomePageError.HEADER_NOT_FOUND;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.example.userinterface.WikipediaHomePage.WIKIPEDIA_HEADER;

public class NavigateTo implements Task {

    private WikipediaHomePage wikipediaHomePage;



    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn(wikipediaHomePage));
        theActor.should(GivenWhenThen.seeThat(WebElementQuestion.the(WIKIPEDIA_HEADER), WebElementStateMatchers.isVisible()).orComplainWith(WikipediaHomePageError.class, HEADER_NOT_FOUND));

    }

    public static NavigateTo theWikipediaHomePage() {
        return Tasks.instrumented(NavigateTo.class);
    }
}
