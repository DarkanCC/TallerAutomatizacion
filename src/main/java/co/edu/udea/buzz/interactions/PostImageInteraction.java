package co.edu.udea.buzz.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Paths;

import static co.edu.udea.buzz.userinterfaces.UserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PostImageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on((BTN_IMAGE)));
        actor.attemptsTo(Enter.theValue("/home/andres/Documentos/TallerAutomatizacion/src/main/java/co/edu/udea/buzz/utils/julio.jpeg").into(INPUT_IMAGE));
        //actor.attemptsTo(Upload.theFile(Paths.get("/home/andres/Documentos/TallerAutomatizacion/src/main/java/co/edu/udea/buzz/utils/julio.jpeg")).to(INPUT_IMAGE));
        WaitUntil.the(IMAGE_PREVIEW, isVisible()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(BTN_SHARE_IMAGE));
    }

    public static PostImageInteraction post() {
        return Tasks.instrumented(PostImageInteraction.class, null);
    }
}