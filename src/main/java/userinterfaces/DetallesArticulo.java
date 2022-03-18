package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com")
public class DetallesArticulo extends PageObject {

    public static final Target CLICK_btn_widgets =
            Target.the("SELECCIONAR CLICK Widgets")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]"));


    public static final Target datepicker =Target.the("BOTTON datepicker").located(By.xpath("//span[contains(text(),'Date Picker')]"));
    public static final Target selectdate =Target.the("BOTTON datepicker").located(By.xpath("//*[@id='datePickerMonthYearInput']"));
    public static final Target dateMonthDateHour =Target.the("BOTTON datepicker").located(By.xpath("//input[@id='dateAndTimePickerInput']"));

}
