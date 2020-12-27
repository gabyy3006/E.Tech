#language: pt
#enconding: UTF-8
#Author: Gabriele Regina

  Funcionalidade: Seu Barriga Hibrido

    @mobile @SeuBarrigaHibrido
    Cenario: Validar novo usuário
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Híbrido"
      E seleciono a opção novo usuário?
      E preencho as informações necessárias
      Quando toco no botão "Cadastrar"
      Então vizualizo a mensagem na view "Usuário inserido com sucesso"
