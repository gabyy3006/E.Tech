#language: pt
#enconding: UTF-8
#Author: Gabriele Regina

Funcionalidade: Opção bem escondida

  @mobile @OpcaoBemEscondida
  Cenario: Validar mensagem de Sucesso
    Dado que esteja na aplicação
    E deslizo a tela para cima
    E toco no botão "Opção bem escondida"
    Quando vizualizo a mensagem sucesso
    Então toco no botão OK