package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaNativoFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import org.junit.Assert;

public class SeuBarrigaNativoSteps {
    private SeuBarrigaNativoFuncionalidade seuBarrigaNativoFuncionalidade;

    public SeuBarrigaNativoSteps() { this.seuBarrigaNativoFuncionalidade = new SeuBarrigaNativoFuncionalidade();}


    @E("^preencho o campo de login$")
    public void preenchoOCampoDeLogin() {
        this.seuBarrigaNativoFuncionalidade.preencheCampoNome();
        this.seuBarrigaNativoFuncionalidade.preencheCampoSenha();
    }

    @Então("^vizualizo a mensagem de erro$")
    public void vizualizoAMensagemDeErro() {
        Assert.assertTrue(this.seuBarrigaNativoFuncionalidade.validaExistenciaErro());
    }

}
