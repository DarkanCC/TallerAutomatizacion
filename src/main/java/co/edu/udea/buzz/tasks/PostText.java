package co.edu.udea.buzz.tasks;

import co.edu.udea.buzz.interactions.PostTextInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PostText implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PostTextInteraction.post());
    }

    public static PostText postText() {
        return Tasks.instrumented(PostText.class, null);
    }
}
