package org.example.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class WikipediaHomePage extends PageObject {

    public static final Target WIKIPEDIA_HEADER = Target.the("Wikipedia Header").locatedBy(".mw-logo-wordmark");
    public static final Target SEARCH_TEXTBOX = Target.the("Search Text Box").locatedBy(".cdx-text-input__input");
    public static final Target SEARCH_BUTTON = Target.the("Search Button").locatedBy(".cdx-search-input__end-button");

}
