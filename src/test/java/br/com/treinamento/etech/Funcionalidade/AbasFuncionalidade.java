package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.AbasPage;
import br.com.treinamento.etech.Pages.HibridoLoginPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbasFuncionalidade extends BaseTest {

    private AbasPage abasPage;
    private AppiumRobot appiumRobot;

    public AbasFuncionalidade(){
        this.abasPage = new AbasPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void ClickAba2(){
        driverWait.until(ExpectedConditions.visibilityOf(this.abasPage.getAba2()));
        this.abasPage.getAba2().click();

    }

    public boolean ConteudoAba1() { return this.appiumRobot.validaExistenciaTexto("Este é o conteúdo da Aba 1");}
    public boolean ConteudoAba2() { return this.appiumRobot.validaExistenciaTexto("Este é o conteúdo da Aba 2");}

}
