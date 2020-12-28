package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SwipeFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;

public class SwipeSteps {
    private SwipeFuncionalidade swipeFuncionalidade;
    private AppiumRobot appiumRobot;

    public SwipeSteps(){ this.swipeFuncionalidade = new SwipeFuncionalidade();
        this.appiumRobot = new AppiumRobot();
    }

    @E("^visualizo as telas$")
    public void visualizoAsTelas() {

    }

    @Quando("^passo para a proxima pagina$")
    public void passoParaAProximaPagina() {
        this.swipeFuncionalidade.moverTelaParaEsquerda();
    }

    @Entao("^vizualizo a mensagem final$")
    public void vizualizoAMensagemFinal() {
        this.swipeFuncionalidade.MensagemFinal();
    }
}
