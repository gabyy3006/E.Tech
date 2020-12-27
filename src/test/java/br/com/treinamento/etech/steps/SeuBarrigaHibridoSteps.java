package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import org.junit.Assert;

public class SeuBarrigaHibridoSteps {
    private SeuBarrigaHibridoFuncionalidade seuBarrigaHibridoFuncionalidade;
    private AppiumRobot appiumRobot;

    public  SeuBarrigaHibridoSteps(){ this.seuBarrigaHibridoFuncionalidade = new SeuBarrigaHibridoFuncionalidade();
        this.appiumRobot = new AppiumRobot();
    }


    @E("^preencho as informações necessárias$")
    public void preenchoAsInformaçõesNecessárias() {
        this.seuBarrigaHibridoFuncionalidade.preenchoCampoNome();
        this.seuBarrigaHibridoFuncionalidade.preenchoCampoEmail();
        this.seuBarrigaHibridoFuncionalidade.preenchoCampoSenha();
    }


    @E("^seleciono a opção novo usuário\\?$")
    public void selecionoAOpçãoNovoUsuário() {
        this.seuBarrigaHibridoFuncionalidade.tocoNovoUsuario();
    }

    @Então("^vizualizo a mensagem usuário inserido com sucesso$")
    public void vizualizoAMensagemUsuárioInseridoComSucesso() {
        Assert.assertTrue(this.seuBarrigaHibridoFuncionalidade.vizualizoAMensagemUsuárioInseridoComSucesso());
    }

    @Então("^vizualizo a mensagem na view \"([^\"]*)\"$")
    public void vizualizoAMensagemNaView(String mensagem) {
        this.appiumRobot.validaExistenciaTextoNaView(mensagem);
    }
}
