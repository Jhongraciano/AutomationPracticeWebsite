package com.automationpractice.reto.tasks;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.automationpractice.reto.userinterface.AddAnewAddressPage.*;

public class AddAnewAddress implements Task {
  private   List<DataAutomationPractice> data;

    public AddAnewAddress(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static AddAnewAddress onTheAutomationPracticePage(List<DataAutomationPractice> data) {

        return Tasks.instrumented(AddAnewAddress.class,data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLICK_MY_ADDRESSES),
                Click.on(CLICK_NEW_ADDRESS),
                Enter.theValue(data.get(0).getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(data.get(0).getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(data.get(0).getStrCompany()).into(INPUT_COMPANY),
                Enter.theValue(data.get(0).getStrAddress()).into(INPUT_ADDRESS),
                Enter.theValue(data.get(0).getStrCity()).into(INPUT_CITY),
                SelectFromOptions.byVisibleText(data.get(0).getStrState()).from(CLICK_STATE),
                Enter.theValue(data.get(0).getPostalCode()).into(INPUT_PASTAL_CODE),
                Enter.theValue(data.get(0).getHomephone()).into(INPUT_HOME_PHONE),
                Enter.theValue(data.get(0).getMobilePhone()).into(INPUT_MOVIL_PHONE),
                Enter.theValue(data.get(0).getAdditionalInformation()).into(TEXT_TAREA),
                Enter.theValue(data.get(0).getFutureReference()).into(INPUT_ALIAS),
                Click.on(CLICK_SAVE)
                );

    }
}
