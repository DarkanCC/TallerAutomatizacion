package co.edu.udea.buzz.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.edu.udea.buzz.userinterfaces.UserInterface.POST_IMAGE_VALIDATE;
import static co.edu.udea.buzz.userinterfaces.UserInterface.POST_TEXT_VALIDATE;

public class ValidationPostImage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(POST_IMAGE_VALIDATE).answeredBy(actor);
    }

    public static ValidationPostImage home() {
        return new ValidationPostImage();
    }
}