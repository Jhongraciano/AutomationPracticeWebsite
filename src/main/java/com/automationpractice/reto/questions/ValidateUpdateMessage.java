package com.automationpractice.reto.questions;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.automationpractice.reto.userinterface.UpdateMyPersonalInformationPage.*;

public class ValidateUpdateMessage implements Question {

    private List<DataAutomationPractice> data;

    public ValidateUpdateMessage(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static ValidateUpdateMessage onTheAutomationPracticePage(List<DataAutomationPractice> data) {
        return new ValidateUpdateMessage(data);
    }


    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TEXT_VALIDATIONS).viewedBy(actor).asString();
    }
}
