package com.automationpractice.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MakeAPurchasePage {
    public static final Target INPUT_SEARCH = Target.the(" ").located(By.id("search_query_top"));
    public static final Target CLICK_SEARCH = Target.the("").located(By.cssSelector("#searchbox > button"));
    public static final Target CLICK_IMAGEN = Target.the("").located(By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link"));
    public static final Target CLICK_ADD = Target.the("").located(By.cssSelector("p#add_to_cart> button"));
    public static final Target CLICK_PROCEED = Target.the("").located(By.cssSelector("div.button-container > a > span"));
    public static final Target CLICK_PROCEED1 = Target.the("").located(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
    public static final Target CLICK_PROCEED2 = Target.the("").located(By.cssSelector("#center_column > form > p > button > span"));
    public static final Target CLICK_T_SERVICE = Target.the("").located(By.id("cgv"));
    public static final Target CLICK_PROCEED3 = Target.the("").located(By.cssSelector("#form > p > button"));
    public static final Target CLICK_PAY_BY = Target.the("").located(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
    public static final Target CLICK_CONFIRM_MY_ORDEN = Target.the("").located(By.cssSelector("#cart_navigation > button > span"));
    public static final Target TEXT_VALIDATIONS = Target.the("").located(By.xpath("//*/div/p/strong[text()='Your order on My Store is complete.']"));

}
