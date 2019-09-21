Feature: compras no site 4all
    Scenario: adicionando produtos e validando mensagem de realizado com sucesso
        Given o usuario esta acessando a seguinte pagina ""
        And o usuario seleciona a seguinte categoria "Doces"
        And o usuario adiciona todos os produtos disponiveis ao carrinho
        And o usuario seleciona a seguinte categoria "Todos"
        And o usuario esta acessando a seguinte pagina "checkout"
        And o usuario aumenta a quantidade do produto "Brigadeiro" em "4"
        When o usuario clica no botao finalizar compra
        Then a mensagem de Pedido realizado com sucesso deve ser apresentada
        And o usuario fecha a modal

    Scenario: adicionar produto, alterar sua quantidade e validar a mensagem pedido realizado com sucesso
        Given o usuario esta acessando a seguinte pagina ""
        And o usuario seleciona a seguinte categoria "Bebidas"
        And o usuario adiciona todos os produtos disponiveis ao carrinho
        And o usuario tem a soma do valor dos produtos
        And o usuario seleciona a seguinte categoria "Todos"
        And o usuario seleciona o produto "Rissole"
        And o usuario tem o valor do produto "Rissole"
        And o usuario esta acessando a seguinte pagina "checkout"
        And o usuario aumenta a quantidade do produto "Rissole" em "9"
        And o usuario diminui a quantidade do produto "Rissole" em "5"
        And o usuario tem a soma dos produtos com suas quantidades
        When o usuario tem o valor total do carrinho
        Then o valor total da compra deve estar correto
        And o usuario clica no botao finalizar compra
        And a mensagem de Pedido realizado com sucesso deve ser apresentada
        And o usuario fecha a modal