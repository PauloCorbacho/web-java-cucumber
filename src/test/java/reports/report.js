$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComprasNoSite4all.feature");
formatter.feature({
  "line": 1,
  "name": "compras no site 4all",
  "description": "",
  "id": "compras-no-site-4all",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4121065017,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "adicionando produtos e validando mensagem de realizado com sucesso",
  "description": "",
  "id": "compras-no-site-4all;adicionando-produtos-e-validando-mensagem-de-realizado-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "o usuario esta acessando a seguinte pagina \"\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "o usuario seleciona a seguinte categoria \"Doces\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "o usuario adiciona todos os produtos disponiveis ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "o usuario seleciona a seguinte categoria \"Todos\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "o usuario esta acessando a seguinte pagina \"checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "o usuario aumenta a quantidade do produto \"Brigadeiro\" em \"4\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "o usuario clica no botao finalizar compra",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a mensagem de Pedido realizado com sucesso deve ser apresentada",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "o usuario fecha a modal",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 44
    }
  ],
  "location": "steps.oUsuarioEstaAcessandoASeguintePagina(String)"
});
formatter.result({
  "duration": 3544668130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Doces",
      "offset": 42
    }
  ],
  "location": "steps.oUsuarioSelecionaASeguinteCategoria(String)"
});
formatter.result({
  "duration": 158607297,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioAdicionaTodosOsProdutosDisponiveisAoCarrinho()"
});
formatter.result({
  "duration": 227803640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Todos",
      "offset": 42
    }
  ],
  "location": "steps.oUsuarioSelecionaASeguinteCategoria(String)"
});
formatter.result({
  "duration": 117449919,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "checkout",
      "offset": 44
    }
  ],
  "location": "steps.oUsuarioEstaAcessandoASeguintePagina(String)"
});
formatter.result({
  "duration": 750149108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brigadeiro",
      "offset": 43
    },
    {
      "val": "4",
      "offset": 59
    }
  ],
  "location": "steps.oUsuarioAumentaAQuantidadeDoProdutoEm(String,int)"
});
formatter.result({
  "duration": 251617671,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioClicaNoBotaoFinalizarCompra()"
});
formatter.result({
  "duration": 57588969,
  "status": "passed"
});
formatter.match({
  "location": "steps.aMensagemDePedidoRealizadoComSucessoDeveSerApresentada()"
});
formatter.result({
  "duration": 26326638,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioFechaAModal()"
});
formatter.result({
  "duration": 65693004,
  "status": "passed"
});
formatter.after({
  "duration": 621677702,
  "status": "passed"
});
formatter.before({
  "duration": 3269090170,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "adicionar produto, alterar sua quantidade e validar a mensagem pedido realizado com sucesso",
  "description": "",
  "id": "compras-no-site-4all;adicionar-produto,-alterar-sua-quantidade-e-validar-a-mensagem-pedido-realizado-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "o usuario esta acessando a seguinte pagina \"\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "o usuario seleciona a seguinte categoria \"Bebidas\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "o usuario adiciona todos os produtos disponiveis ao carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "o usuario tem a soma do valor dos produtos",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "o usuario seleciona a seguinte categoria \"Todos\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "o usuario seleciona o produto \"Rissole\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "o usuario tem o valor do produto \"Rissole\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "o usuario esta acessando a seguinte pagina \"checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "o usuario aumenta a quantidade do produto \"Rissole\" em \"9\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "o usuario diminui a quantidade do produto \"Rissole\" em \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "o usuario tem a soma dos produtos com suas quantidades",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "o usuario tem o valor total do carrinho",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "o valor total da compra deve estar correto",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "o usuario clica no botao finalizar compra",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "a mensagem de Pedido realizado com sucesso deve ser apresentada",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "o usuario fecha a modal",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 44
    }
  ],
  "location": "steps.oUsuarioEstaAcessandoASeguintePagina(String)"
});
formatter.result({
  "duration": 1093091342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bebidas",
      "offset": 42
    }
  ],
  "location": "steps.oUsuarioSelecionaASeguinteCategoria(String)"
});
formatter.result({
  "duration": 145404207,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioAdicionaTodosOsProdutosDisponiveisAoCarrinho()"
});
formatter.result({
  "duration": 196705243,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioTemASomaDoValorDosProdutos()"
});
formatter.result({
  "duration": 78553402,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Todos",
      "offset": 42
    }
  ],
  "location": "steps.oUsuarioSelecionaASeguinteCategoria(String)"
});
formatter.result({
  "duration": 107514101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole",
      "offset": 31
    }
  ],
  "location": "steps.oUsuarioSelecionaOProduto(String)"
});
formatter.result({
  "duration": 236741315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole",
      "offset": 34
    }
  ],
  "location": "steps.oUsuarioTemOValorDoProduto(String)"
});
formatter.result({
  "duration": 132164338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "checkout",
      "offset": 44
    }
  ],
  "location": "steps.oUsuarioEstaAcessandoASeguintePagina(String)"
});
formatter.result({
  "duration": 714164342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole",
      "offset": 43
    },
    {
      "val": "9",
      "offset": 56
    }
  ],
  "location": "steps.oUsuarioAumentaAQuantidadeDoProdutoEm(String,int)"
});
formatter.result({
  "duration": 440854657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole",
      "offset": 43
    },
    {
      "val": "5",
      "offset": 56
    }
  ],
  "location": "steps.oUsuarioDiminuiAQuantidadeDoProdutoEm(String,String)"
});
formatter.result({
  "duration": 259604244,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioTemASomaDosProdutosComSuasQuantidades()"
});
formatter.result({
  "duration": 54740,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioTemOValorTotalDoCarrinho()"
});
formatter.result({
  "duration": 23877894,
  "status": "passed"
});
formatter.match({
  "location": "steps.oValorTotalDaCompraDeveEstarCorreto()"
});
formatter.result({
  "duration": 28510,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioClicaNoBotaoFinalizarCompra()"
});
formatter.result({
  "duration": 51744940,
  "status": "passed"
});
formatter.match({
  "location": "steps.aMensagemDePedidoRealizadoComSucessoDeveSerApresentada()"
});
formatter.result({
  "duration": 27682301,
  "status": "passed"
});
formatter.match({
  "location": "steps.oUsuarioFechaAModal()"
});
formatter.result({
  "duration": 74005163,
  "status": "passed"
});
formatter.after({
  "duration": 614948146,
  "status": "passed"
});
});