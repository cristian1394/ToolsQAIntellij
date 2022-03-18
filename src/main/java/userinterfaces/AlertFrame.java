package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com")
public class AlertFrame extends PageObject {

    public static final Target alertsframe =
            Target.the("SELECCIONAR ALERTS")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]"));


    public static final Target alerts =Target.the("BOTTON alerts").located(By.xpath("//span[contains(text(),'Alerts')]"));
    public static final Target btnClic1 =Target.the("BOTTON btnClic1").located(By.xpath("//button[@id='alertButton']"));
    public static final Target btnClic2 =Target.the("BOTTON btnClic1").located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target btnClic3 =Target.the("BOTTON btnClic1").located(By.xpath("//button[@id='confirmButton']"));
    public static final Target btnClic4 =Target.the("BOTTON btnClic1").located(By.xpath("//button[@id='promtButton']"));







}
