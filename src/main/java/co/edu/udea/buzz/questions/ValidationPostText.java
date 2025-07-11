package co.edu.udea.buzz.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.edu.udea.buzz.userinterfaces.UserInterface.POST_TEXT_VALIDATE;

public class ValidationPostText implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String temp = POST_TEXT_VALIDATE.resolveFor(actor).getText();
        return temp.contains("Automatizando publicaciones con Screenplay");
    }

    public static ValidationPostText home() {
        return new ValidationPostText();
    }
}