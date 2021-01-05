#language: pt
#enconding: UTF-8
#Author: Gabriele Regina

Funcionalidade: Alertas

  @mobile @Alertas
  Cenario: Validar Alertas Simples
    Dado que esteja na aplicação
    E toco no botão Alertas
    E seleciono a opção ALERTA SIMPLES
    Quando aparece a mensagem info
    Então toco para fora
    E toco no botão "ok