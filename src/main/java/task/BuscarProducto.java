package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePAge.*;

public class BuscarProducto implements Task {
    private String nombre;
    private String apellido;

    private String Email;
    private String Age;
    private String Salary;
    private String Department;

    public BuscarProducto(String nombre ,String apellido,String Email,String Age,String Salary,String Department)
    {


        this.nombre = nombre;
        this.apellido = apellido;
        this.Email = Email;
        this.Age = Age;
        this.Salary = Salary;
        this.Department = Department;


    }


    public static  BuscarProducto conDescripcion(String nombre, String apellido,String Email,String Age,String Salary,String Department){


        return instrumented(BuscarProducto.class,nombre,apellido,Email,Age,Salary,Department);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPTSTO
        actor.attemptsTo(

                TiempoEspera.unMomento(4),
                Click.on(LINK_btnelements),
                Click.on(LINK_webtables),
                Click.on(LINK_add),// SELECCIONA EL PRODUCTO A AGREGAR
                Click.on(txtFN),
                TiempoEspera.unMomento(4),
                Enter.theValue(nombre).into(txtFN),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                Enter.theValue(apellido).into(txtLN),
                Enter.theValue(Email).into(txtEmail),
                Enter.theValue(Age).into(txtAge),
                Enter.theValue(Salary).into(txtSalary),
                Enter.theValue(Department).into(txtDepartment),
                TiempoEspera.unMomento(2),
                Click.on(submit),
                Click.on(delete),
               // Hit.the(Keys.ENTER).into(txtFN), //REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(4));










    }
}
