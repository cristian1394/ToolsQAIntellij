package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com")

public class HomePAge extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA

    public static final Target INPUT_TXT_BUSQUEDA =
            Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA")
                    .located(By.xpath("//input[@class = 'nav-search-input']"));

    public static final Target LINK_btnelements =
            Target.the("SELECCIONAR ELEMENTS")
                    .located(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
    public static final Target LINK_webtables =
            Target.the("SELECCIONAR WEBTABLES")
                    .located(By.xpath("//span[contains(text(),'Web Tables')]"));

    public static final Target LINK_add =Target.the("BOTTON ADD").located(By.xpath("//button[@id='addNewRecordButton']"));

    public static final Target txtFN =Target.the("BOTTON FN").located(By.xpath("//input[@id='firstName']"));
    public static final Target txtLN =Target.the("BOTTON LN").located(By.xpath("//input[@id='lastName']"));

    public static final Target txtEmail =Target.the("BOTTON Email").located(By.xpath("//input[@id='userEmail']"));
    public static final Target txtAge =Target.the("BOTTON Age").located(By.xpath("//input[@id='age']"));
    public static final Target txtSalary =Target.the("BOTTON Salary").located(By.xpath("//input[@id='salary']"));
    public static final Target txtDepartment =Target.the("BOTTON Departament").located(By.xpath("//input[@id='department']"));

    public static final Target submit =Target.the("BOTTON submit").located(By.xpath("//button[@id='submit']"));
    public static final Target delete =Target.the("BOTTON delete").located(By.xpath("//span[@id='delete-record-2']"));

}