package com.automationpractice.reto.tasks;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.automationpractice.reto.userinterface.MakeAPurchasePage.*;

public class MakeAPurchase implements Task {

    private List<DataAutomationPractice> data;

    public MakeAPurchase(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static MakeAPurchase onTheAutomationPracticePage(List<DataAutomationPractice> data) {
        return Tasks.instrumented(MakeAPurchase.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrNameProduct()).into(INPUT_SEARCH),
                Click.on(CLICK_SEARCH),
                Click.on(CLICK_IMAGEN),
                Click.on(CLICK_ADD),
                Click.on(CLICK_PROCEED),
                Click.on(CLICK_PROCEED1),
                Click.on(CLICK_PROCEED2),
                Click.on(CLICK_T_SERVICE),
                Click.on(CLICK_PROCEED3),
                Click.on(CLICK_PAY_BY),
                Click.on(CLICK_CONFIRM_MY_ORDEN)

        );
    }
}
