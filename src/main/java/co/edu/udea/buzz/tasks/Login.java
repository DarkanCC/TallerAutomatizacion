package co.edu.udea.buzz.tasks;

import co.edu.udea.buzz.interactions.LoginInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Login implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginInteraction.login());
    }

    public static Login login() {
        return Tasks.instrumented(Login.class, null);
    }
}