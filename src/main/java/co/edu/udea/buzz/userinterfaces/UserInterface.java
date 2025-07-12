package co.edu.udea.buzz.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserInterface {
    public static final Target INPUT_USER = Target.the("INPUT USER").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    public static final Target BTN_LOGIN = Target.the("BUTTON LOGIN").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    public static final Target INPUT_POST = Target.the("INPUT POST").located(By.cssSelector("textarea.oxd-buzz-post-input"));
    public static final Target BTN_POST = Target.the("BUTTON POST").located(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main"));
    public static final Target POST_TEXT_VALIDATE = Target.the("POST TEXT VALIDATION").located(By.cssSelector("p.oxd-text.oxd-text--p.orangehrm-buzz-post-body-text"));
    public static final Target BTN_SHARE = Target.the("BUTTON SHARE").locatedBy("//button[contains(., 'Share')]");
    public static final Target INPUT_IMAGE = Target.the("INPUT IMAGE").located(By.cssSelector("input.oxd-file-input"));
    public static final Target BTN_SHARE_IMAGE = Target.the("BUTTON SHARE IMAGE").locatedBy("//button[contains(., 'Share Photos')]");
    public static final Target IMAGE_PREVIEW = Target.the("IMAGE PREVIEW").located(By.cssSelector("img[src*='/buzz/photo/']"));
    public static final Target POST_IMAGE_VALIDATE = Target.the("POST IMAGE VALIDATION").located(By.cssSelector("img[src*='/buzz/photo/']"));
}