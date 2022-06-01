package com.automationpractice.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInPage {
    public static final Target CLICK_SIGN_IN = Target.the("Click on sign In").located(By.xpath("//*/div[2]/div/div/nav/div[1]/a"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Enter email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password").located(By.id("passwd"));
    public static final Target CLICK_SIGN_IN1 = Target.the("Click on sign In").located(By.id("SubmitLogin"));
}
