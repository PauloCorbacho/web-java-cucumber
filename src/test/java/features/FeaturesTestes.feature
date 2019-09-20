Feature: compras no site 4all

  Scenario: adicionando produtos e validando mensagem de realizado com sucesso
    Given o usuario esta acessando a seguinte pagina ""
    And o usuario seleciona a seguinte categoria "Bebidas"
    And o usuario adiciona todos os produtos disponiveis ao carrinho
    And o usuario seleciona a seguinte categoria "Todos"
    And o usuario esta acessando a seguinte pagina "checkout"
    And o usuario aumenta a quantidade do produto "Rissole" em "9"
    When o usuario clica no botao finalizar compra
    Then a mensagem de Pedido realizado com sucesso deve ser apresentada
    And o usuario fecha a modal
