#language: pt
#enconding: UTF-8
#Author: Gabriele Regina

Funcionalidade: Seu Barriga Hibrido

  @mobile @HibridoLogin
  Cenario: Validar novo usuário
    Dado que esteja na aplicação
    E toco no botão "SeuBarriga Híbrido"
    E preencho o campo de email "teste56@test.com" e senha "123456"
    Quando toco no botão "Entrar"
    Então abri na pagina Home