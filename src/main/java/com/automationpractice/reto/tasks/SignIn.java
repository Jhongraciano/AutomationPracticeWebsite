package com.automationpractice.reto.tasks;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.automationpractice.reto.userinterface.SignInPage.*;

public class SignIn implements Task {

    private List<DataAutomationPractice> data;

    public SignIn(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static SignIn onTheAutomationPracticePage(List<DataAutomationPractice> data) {
        return Tasks.instrumented(SignIn.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLICK_SIGN_IN),
                Enter.theValue(data.get(0).getStrEmail()).into(INPUT_EMAIL_ADDRESS),
                Enter.theValue(data.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(CLICK_SIGN_IN1)
        );
    }
}
