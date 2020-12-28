package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HibridoLoginFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class HibridoLoginSteps {
    private HibridoLoginFuncionalidade hibridoLoginFuncionalidade;
    private AppiumRobot appiumRobot;

    public HibridoLoginSteps(){ this.hibridoLoginFuncionalidade = new HibridoLoginFuncionalidade();
        this.appiumRobot = new AppiumRobot();
    }


    @E("^preencho o campo de email \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preenchoOCampoDeEmailESenha(String email, String senha) {
        this.hibridoLoginFuncionalidade.InsiroCampoEmail(email);
        this.hibridoLoginFuncionalidade.InsiroCampoSenha(senha);
    }

    @Então("^abri na pagina Home$")
    public void abriNaPaginaHome() {
        this.appiumRobot.validaExistenciaTextoNaView("Home");
    }
}
