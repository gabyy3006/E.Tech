package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.HibridoLoginPage;
import br.com.treinamento.etech.Pages.SeuBarrigaHibridoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HibridoLoginFuncionalidade<appiumRobot> extends BaseTest {

    private HibridoLoginPage hibridoLoginPage;
    private AppiumRobot appiumRobot;

    public HibridoLoginFuncionalidade(){
        this.hibridoLoginPage = new HibridoLoginPage(driver);
        this.appiumRobot = new AppiumRobot();
    }

    public void InsiroCampoEmail(String email) {
        driverWait.until(ExpectedConditions.visibilityOf(this.hibridoLoginPage.getEmail()));
        this.hibridoLoginPage.getEmail().sendKeys(email);
    }

    public void InsiroCampoSenha(String senha) {
        driverWait.until(ExpectedConditions.visibilityOf(this.hibridoLoginPage.getSenha()));
        this.hibridoLoginPage.getSenha().sendKeys(senha);
    }


}
