package com.automationpractice.reto.tasks;

import com.automationpractice.reto.userinterface.OpenTheBrowserpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

    private OpenTheBrowserpage openTheBrowserpage;
    public static OpenTheBrowser onTheAutomationPracticePage() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(openTheBrowserpage)
        );

    }
}
