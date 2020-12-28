package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.AbasFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AbasSteps {
    private AbasFuncionalidade abasFuncionalidade;
    private AppiumRobot appiumRobot;

    public  AbasSteps(){ this.abasFuncionalidade = new AbasFuncionalidade();
        this.appiumRobot = new AppiumRobot();
    }

    @E("^verifico o conteudo da Aba$")
    public void verificoOConteudoDaAba() {
        this.abasFuncionalidade.ConteudoAba1();
    }

    @Entao("^verifico o conteudo da Aba Dois$")
    public void verificoOConteudoDaAbaDois() {
        this.abasFuncionalidade.ConteudoAba2();
    }

    @Quando("^toco no botão Aba2$")
    public void tocoNoBotãoAba() {
        this.abasFuncionalidade.ClickAba2();
    }

}
