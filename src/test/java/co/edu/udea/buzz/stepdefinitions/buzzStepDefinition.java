package co.edu.udea.buzz.stepdefinitions;

import co.edu.udea.buzz.questions.ValidationPostImage;
import co.edu.udea.buzz.tasks.PostImage;
import co.edu.udea.buzz.tasks.PostText;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

import co.edu.udea.buzz.questions.ValidationPostText;
import co.edu.udea.buzz.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class buzzStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor usuario = Actor.named("usuario");

    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        usuario.can(BrowseTheWeb.with(driver));
        usuario.attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz"));
    }

    @Given("el usuario esta autenticado correctamente en OrangeHRM")
    public void login() {
        usuario.attemptsTo(Login.login());
    }

    @When("postea el mensaje 'Automatizando publicaciones con Screenplay'")
    public void posteaTexto() {
        usuario.attemptsTo(PostText.postText());
    }

    @Then("debería ver su nota publicada en la parte superior del muro")
    public void veoTexto() {
        usuario.should(seeThat(ValidationPostText.home(),equalTo(true)));
    }

    @When("publica una imagen desde su dispositivo")
    public void posteaImagen() {
        usuario.attemptsTo(PostImage.postImage());
    }

    @Then("deberia ver su publicacion con la imagen adjunta en el muro")
    public void veoImagen() {
        usuario.should(seeThat(ValidationPostImage.home(),equalTo(true)));
    }
}