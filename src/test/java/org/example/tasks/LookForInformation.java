package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userinterface.WikipediaHomePage;

public class LookForInformation implements Task {

    private final String keyword;

    public LookForInformation(String keyword){
        this.keyword = keyword;
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Enter.theValue(keyword).into(WikipediaHomePage.SEARCH_TEXTBOX),
                Click.on(WikipediaHomePage.SEARCH_BUTTON));
    }

    public static LookForInformation about(String keyword){
        return Tasks.instrumented(LookForInformation.class, keyword);
    }
}
