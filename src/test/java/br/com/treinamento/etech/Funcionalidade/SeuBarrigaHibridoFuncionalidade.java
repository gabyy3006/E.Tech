package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaHibridoPage;
import br.com.treinamento.etech.Pages.SeuBarrigaNativoPage;
import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaHibridoFuncionalidade<appiumRobot> extends BaseTest {

    private SeuBarrigaHibridoPage seuBarrigaHibridoPage;
    private AppiumRobot appiumRobot;
    private String nome, email, senha;
    private Faker faker;

    public SeuBarrigaHibridoFuncionalidade() {
        this.seuBarrigaHibridoPage = new SeuBarrigaHibridoPage(driver);
        this.appiumRobot = new AppiumRobot();
        this.faker = new Faker();
    }

    public void preenchoCampoNome(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getNome()));
        nome = faker.name().fullName();
        this.seuBarrigaHibridoPage.getNome().sendKeys(nome);

    }

    public void preenchoCampoEmail(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getEmail()));
        email = faker.internet().emailAddress();
        this.seuBarrigaHibridoPage.getEmail().sendKeys(email);

    }

    public void preenchoCampoSenha(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getSenha()));
        senha = faker.internet().password();
        this.seuBarrigaHibridoPage.getSenha().sendKeys(senha);
    }

    public void tocoNovoUsuario(){
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getnovoUsuario()));
        this.seuBarrigaHibridoPage.getnovoUsuario().click();
    }

    public boolean vizualizoAMensagemUsuárioInseridoComSucesso() { return this.appiumRobot.validaExistenciaTextoNaView("Usuário inserido com sucesso");}
}
