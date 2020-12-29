package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.OpcaoBemEscondidaPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpcaoBemEscondidaFuncionalidade extends BaseTest {

    private OpcaoBemEscondidaPage opcaoBemEscondidaPage;
    private AppiumRobot appiumRobot;
    private TouchAction touchAction;

    public OpcaoBemEscondidaFuncionalidade(){
        this.opcaoBemEscondidaPage = new OpcaoBemEscondidaPage(driver);
        this.appiumRobot = new AppiumRobot();
        this.touchAction = new TouchAction(driver);
    }

    public void BotaoOk(){
        driverWait.until(ExpectedConditions.visibilityOf(this.opcaoBemEscondidaPage.getOk()));
        this.opcaoBemEscondidaPage.getOk().click();
    }
    public void DeslizoTela() {
        this.touchAction.longPress(new PointOption().withCoordinates(500, 1000))
                .moveTo(new PointOption().withCoordinates(500, 200))
                .release()
                .perform();
    }

    public boolean validaExistenciaMensagem() { return this.appiumRobot.validaExistenciaTexto("Você achou essa opção");}

}
