package com.automationpractice.reto.tasks;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.automationpractice.reto.userinterface.UpdateMyPersonalInformationPage.*;

public class UpdateMyPersonalInformation implements Task {

    private List<DataAutomationPractice> data;

    public UpdateMyPersonalInformation(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static UpdateMyPersonalInformation onTheAutomationPracticePage(List<DataAutomationPractice> data) {
        return Tasks.instrumented(UpdateMyPersonalInformation.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CLICK_YOUR_PERSONAL_INFORMATION),
                SelectFromOptions.byValue(data.get(0).getStrDay()).from(CLICK_DAYS),
                SelectFromOptions.byValue(data.get(0).getStrMonth()).from(ENTER_MARCH),
                SelectFromOptions.byValue(data.get(0).getStrYear()).from(ENTER_YEAR),
                Enter.theValue(data.get(0).getPasswd()).into(INPUT_PASSWORD),
                Click.on(CLICK_SAVE)
        );


    }
}
