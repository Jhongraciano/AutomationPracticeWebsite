package com.automationpractice.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddAnewAddressPage {
    public static final Target CLICK_MY_ADDRESSES = Target.the(" ").located(By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a"));
    public static final Target CLICK_NEW_ADDRESS = Target.the(" ").located(By.cssSelector("#center_column > div.clearfix.main-page-indent > a"));
    public static final Target INPUT_FIRST_NAME = Target.the("").located(By.id("firstname"));
    public static final Target INPUT_LAST_NAME = Target.the("").located(By.id("lastname"));
    public static final Target INPUT_COMPANY = Target.the("").located(By.id("company"));
    public static final Target INPUT_ADDRESS = Target.the("").located(By.id("address1"));
    public static final Target INPUT_CITY = Target.the("").located(By.id("city"));
    public static final Target CLICK_STATE = Target.the("").located(By.id("id_state"));
    public static final Target INPUT_PASTAL_CODE = Target.the("").located(By.id("postcode"));
    public static final Target INPUT_HOME_PHONE = Target.the("").located(By.id("phone"));
    public static final Target INPUT_MOVIL_PHONE = Target.the("").located(By.id("phone_mobile"));
    public static final Target TEXT_TAREA = Target.the("").located(By.id("other"));
    public static final Target INPUT_ALIAS = Target.the("").located(By.id("alias"));
    public static final Target CLICK_SAVE = Target.the("").located(By.id("submitAddress"));
    public static final Target TEXT_VAIDATIONS = Target.the("").located(By.cssSelector("#center_column > div.addresses > div > div:nth-child(2) > ul > li:nth-child(1) > h3"));

}
