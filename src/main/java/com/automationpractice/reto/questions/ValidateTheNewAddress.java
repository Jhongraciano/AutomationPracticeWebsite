package com.automationpractice.reto.questions;

import com.automationpractice.reto.models.DataAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.automationpractice.reto.userinterface.AddAnewAddressPage.*;

public class ValidateTheNewAddress implements Question<Boolean> {

    private List<DataAutomationPractice> data;

    public ValidateTheNewAddress(List<DataAutomationPractice> data) {
        this.data = data;
    }

    public static ValidateTheNewAddress onTheAutomationPracticePage(List<DataAutomationPractice> data) {
        return new ValidateTheNewAddress(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String futureReference = Text.of(TEXT_VAIDATIONS).viewedBy(actor).asString();
        if(futureReference.equals(futureReference)) {
            result = true;
        }else {
            result= false;
        }
        return result;
    }
}
