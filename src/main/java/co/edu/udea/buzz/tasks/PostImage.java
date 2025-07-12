package co.edu.udea.buzz.tasks;

import co.edu.udea.buzz.interactions.PostImageInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PostImage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PostImageInteraction.withImage("src\\main\\java\\co\\edu\\udea\\buzz\\utils\\julio.jpeg")
        );
    }

    public static PostImage postImage() {
        return Tasks.instrumented(PostImage.class, null);
    }
}
