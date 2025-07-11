package co.edu.udea.buzz.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UserInterface {
    public static final Target INPUT_USER = Target.the("INPUT USER").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    public static final Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    public static final Target BTN_LOGIN = Target.the("BUTTON LOGIN").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    public static final Target INPUT_POST = Target.the("INPUT POST").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/textarea");
    public static final Target BTN_POST = Target.the("BUTTON POST").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/form/div/div/button");
    public static final Target POST_TEXT_VALIDATE = Target.the("POST TEXT VALIDATION").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[1]/div/div[2]/div/p[1]");
    public static final Target BTN_IMAGE = Target.the("BUTTON IMAGE").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/button[1]");
    public static final Target INPUT_IMAGE = Target.the("INPUT IMAGE").locatedBy("//*[@id='Buzz Newsfeed']/div/div[2]/div/div/div/form/div[2]/div[1]/div[2]/input");
    public static final Target BTN_SHARE_IMAGE = Target.the("BUTTON SHARE IMAGE").locatedBy("//*[@id='Buzz Newsfeed']/div/div[2]/div/div/div/form/div[3]/button");
    public static final Target IMAGE_PREVIEW = Target.the("IMAGE PREVIEW").locatedBy("//*[@id='Buzz Newsfeed']/div/div[2]/div/div/div/form/div[3]/button");
    public static final Target POST_IMAGE_VALIDATE = Target.the("POST IMAGE VALIDATION").locatedBy("//*[@id='Buzz Newsfeed']/div/div[2]/div/div/div/form/div[2]/div[2]/div/img");
}