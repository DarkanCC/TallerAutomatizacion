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

    private final String imagePath;

    public PostImageInteraction(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHARE_IMAGE),
                Upload.theFile(Paths.get(imagePath)).to(INPUT_IMAGE),
                WaitUntil.the(IMAGE_PREVIEW, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_SHARE)
        );
    }

    public static PostImageInteraction withImage(String imagePath) {
        return new PostImageInteraction(imagePath);
    }
}
