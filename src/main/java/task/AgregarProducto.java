package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticulo.*;

public class AgregarProducto implements Task {

    private static String Fecha;
    private static String TiempoDia;


    //CREAR NUESTRO CONSTRUCTOR
    public AgregarProducto(String Fecha,String TiempoDia){
        //CREAR VARIABLE
        this.Fecha=Fecha;
        this.TiempoDia=TiempoDia;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Scroll.to(CLICK_btn_widgets)),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_btn_widgets),
                TiempoEspera.unMomento(3),
                Click.on(datepicker),
                //Click.on(selectdate),

                /*
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                Hit.the(Keys.BACK_SPACE).keyIn(selectdate),
                 */
                Hit.the(Keys.SHIFT,Keys.HOME).into(selectdate),
                Hit.the(Keys.BACK_SPACE).into(selectdate),
                //Limpiar Barra

                Enter.theValue(Fecha).into(selectdate),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),

                Hit.the(Keys.ENTER).into(selectdate),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA

                //Click.on(dateMonthDateHour),
                TiempoEspera.unMomento(3),

                /*
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).keyIn(dateMonthDateHour),

                 */
                Hit.the(Keys.SHIFT,Keys.HOME).into(dateMonthDateHour),
                Hit.the(Keys.BACK_SPACE).into(dateMonthDateHour),

                Enter.theValue(TiempoDia).into(dateMonthDateHour),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),

                Hit.the(Keys.ENTER).into(dateMonthDateHour),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA

                TiempoEspera.unMomento(3));

    }

    public static AgregarProducto cantidad (String Fecha,String TiempoDia){
        return instrumented(AgregarProducto.class,Fecha,TiempoDia);

    }
}
