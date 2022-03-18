package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;
import task.AlertProducto;
import task.BuscarProducto;
import userinterfaces.HomePAge;

public class EjemploSemilleroSteps
{
    @Managed(driver="chrome")
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    private HomePAge homePage=new HomePAge();


    public EjemploSemilleroSteps() {
    }


    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccederAlaWebDeComprar(){
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));


        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) homePage));



    }

    @Cuando("^el agrega (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*) , (.*), (.*) al carrito$")
    public void elAgregaUnProductoAlCarrito( String nombre , String apellido, String Email, String Age, String Salary,
                                             String Department , String Fecha,String TiempoDia,String Botton) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(nombre,apellido,Email,Age,Salary,Department),
        AgregarProducto.cantidad(Fecha,TiempoDia),
        AlertProducto.botones(Botton));




    }

    @Entonces("el ve los productos en el carrito de compras")
    public  void elVeLosProductosEnElCarritoDeCompras() {


    }

    @Cuando("el agrega un producto al carrito")
    public void elAgregaUnProductoAlCarrito123456(String descripcion , String apellido,String Email,String Age,String Salary,
                                                  String Department,String cantidad,String TiempoDia,String Botton){
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion,apellido,Email,Age,Salary,Department),
                AgregarProducto.cantidad(cantidad,TiempoDia),
                AlertProducto.botones(Botton));


    }

}