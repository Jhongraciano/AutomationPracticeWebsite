package com.automationpractice.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpdateMyPersonalInformationPage {
    public static final Target CLICK_YOUR_PERSONAL_INFORMATION= Target.the("Click on YOUR PERSONAL INFORMATON").located(By.cssSelector("div > div:nth-child(1) > ul > li:nth-child(4) > a > span"));
    public static final Target CLICK_DAYS= Target.the("Click on day").located(By.cssSelector("#days"));
   public static final Target ENTER_MARCH = Target.the("Enter march").located(By.cssSelector("#months"));
    public static final Target ENTER_YEAR = Target.the("Enter year").located(By.cssSelector("#years"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password").located(By.id("old_passwd"));
    public static final Target CLICK_SAVE = Target.the("Click on sign In").located(By.name("submitIdentity"));
    public static final Target TEXT_VALIDATIONS = Target.the("the message that has been successfully updated").located(By.xpath("//*/div/p[@class='alert alert-success']"));
}
