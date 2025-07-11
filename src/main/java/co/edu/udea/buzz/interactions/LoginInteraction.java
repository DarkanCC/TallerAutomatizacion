package co.edu.udea.buzz.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.edu.udea.buzz.userinterfaces.UserInterface.BTN_LOGIN;
import static co.edu.udea.buzz.userinterfaces.UserInterface.INPUT_PASSWORD;
import static co.edu.udea.buzz.userinterfaces.UserInterface.INPUT_USER;

public class LoginInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Admin").into(INPUT_USER));
        actor.attemptsTo(Enter.theValue("admin123").into(INPUT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static LoginInteraction login() {
        return Tasks.instrumented(LoginInteraction.class, null);
    }
}
