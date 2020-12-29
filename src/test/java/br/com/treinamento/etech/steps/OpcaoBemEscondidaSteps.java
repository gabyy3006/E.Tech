package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.OpcaoBemEscondidaFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class OpcaoBemEscondidaSteps {

    private OpcaoBemEscondidaFuncionalidade opcaoBemEscondidaFuncionalidade;

    public OpcaoBemEscondidaSteps()  { this.opcaoBemEscondidaFuncionalidade = new OpcaoBemEscondidaFuncionalidade(); }


    @Quando("^vizualizo a mensagem sucesso$")
    public void vizualizoAMensagemSucesso() {
        Assert.assertTrue(this.opcaoBemEscondidaFuncionalidade.validaExistenciaMensagem());
    }

    @Então("^toco no botão OK$")
    public void tocoNoBotãoOK() {
        this.opcaoBemEscondidaFuncionalidade.BotaoOk();
    }

    @E("^deslizo a tela para cima$")
    public void deslizoATelaParaCima() {
        this.opcaoBemEscondidaFuncionalidade.DeslizoTela();
    }
}
