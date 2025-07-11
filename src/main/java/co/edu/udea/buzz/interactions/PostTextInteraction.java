package co.edu.udea.buzz.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.buzz.userinterfaces.UserInterface.BTN_POST;
import static co.edu.udea.buzz.userinterfaces.UserInterface.INPUT_POST;

public class PostTextInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Automatizando publicaciones con Screenplay").into(INPUT_POST));
        actor.attemptsTo(Click.on(BTN_POST));
    }

    public static PostTextInteraction post() {
        return Tasks.instrumented(PostTextInteraction.class, null);
    }
}