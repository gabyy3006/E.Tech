package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaNativoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaNativoFuncionalidade extends BaseTest {

    private SeuBarrigaNativoPage seuBarrigaNativoPage;
    private AppiumRobot appiumRobot;

    public SeuBarrigaNativoFuncionalidade(){
        this.seuBarrigaNativoPage = new SeuBarrigaNativoPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void preencheCampoNome(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaNativoPage.getNome()));
        this.seuBarrigaNativoPage.getNome().sendKeys("test");

    }

    public void preencheCampoSenha(){
        this.seuBarrigaNativoPage.getSenha().sendKeys("123456");
    }

    public boolean validaExistenciaErro() { return this.appiumRobot.validaExistenciaTexto("Problemas com o login");}


}
