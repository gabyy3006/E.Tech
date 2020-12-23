#language: pt
#enconding: UTF-8
#Author: Gabriele Regina

  Funcionalidade: Seu Barriga Nativo

    @mobile @SeuBarrigaNativo
    Cenario: Validar Login e senha invalidos
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Nativo"
      E preencho o campo de login
      Quando toco no botão "ENTRAR"
      Então vizualizo a mensagem de erro

