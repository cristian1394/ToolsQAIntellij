package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static userinterfaces.AlertFrame.*;
import static userinterfaces.HomePAge.LINK_btnelements;
import static userinterfaces.HomePAge.LINK_webtables;

public class AlertProducto implements Task {

    private static String Botton;

    public AlertProducto(String Botton) {

        this.Botton=Botton;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Click.on(alertsframe),
                Click.on(alerts),
                Click.on(btnClic1),
                TiempoEspera.unMomento(4));

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        actor.attemptsTo(

                TiempoEspera.unMomento(1),
                Click.on(btnClic2),
                TiempoEspera.unMomento(7));

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        actor.attemptsTo(

                TiempoEspera.unMomento(6),
                Click.on(btnClic3),
                TiempoEspera.unMomento(4));

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        actor.attemptsTo(

                TiempoEspera.unMomento(6),
                Click.on(btnClic3),
                TiempoEspera.unMomento(4));

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(

                Click.on(btnClic4),
                TiempoEspera.unMomento(4));

        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        TiempoEspera.unMomento(4);

        alert.sendKeys(String.valueOf(Botton));
        TiempoEspera.unMomento(4);

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(TiempoEspera.unMomento(5));


}

    public static AlertProducto botones (String Botton) {
        return instrumented(AlertProducto.class,Botton);


    }
}

