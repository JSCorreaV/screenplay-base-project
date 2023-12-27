package org.example.exceptions;

public class WikipediaHomePageError extends AssertionError {

    public static final String HEADER_NOT_FOUND = "The wikipedia home page could not be loaded";

    public WikipediaHomePageError(String message, Throwable cause) {super(message, cause);}

}
