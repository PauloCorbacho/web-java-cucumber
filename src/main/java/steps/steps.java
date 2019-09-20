package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import paginas.PaginaCarrinho;
import paginas.PaginaInicial;
import paginas.Paginas;

public class steps {
    Paginas paginas = new Paginas();
    PaginaInicial paginaInicial = new PaginaInicial();
    PaginaCarrinho paginaCarrinho = new PaginaCarrinho();

    private double valorDeTodosProdutosBebida = 0.00;
    private double valorDoProduto = 0.00;
    private double valorTotal = 0.00;
    private double valorTotalDoCarrinho = 0.00;

    @Given("^o usuario esta acessando a seguinte pagina \"([^\"]*)\"$")
    public void oUsuarioEstaAcessandoASeguintePagina(String pagina) throws Throwable {
        paginas.acessarPagina(pagina);
    }

    @And("^o usuario seleciona a seguinte categoria \"([^\"]*)\"$")
    public void oUsuarioSelecionaASeguinteCategoria(String categoria) throws Throwable {
        paginaInicial.selecionarCategoria(categoria);
    }

    @And("^o usuario adiciona todos os produtos disponiveis ao carrinho$")
    public void oUsuarioAdicionaTodosOsProdutosDisponiveisAoCarrinho() {
        paginaInicial.adicionarTodosProdutosNoCarrinho();
    }

    @And("^o usuario aumenta a quantidade do produto \"([^\"]*)\" em \"([^\"]*)\"$")
    public void oUsuarioAumentaAQuantidadeDoProdutoEm(String produto, int quantidade) throws Throwable {
        paginaCarrinho.aumentarQuantidadeProdutoNovo(produto, quantidade);
    }

    @When("^o usuario clica no botao finalizar compra$")
    public void oUsuarioClicaNoBotaoFinalizarCompra() {
        paginaCarrinho.finalizarCompra();
    }

    @And("^o usuario fecha a modal$")
    public void oUsuarioFechaAModal() {
        paginaCarrinho.fecharMensagemStatusPedido();
    }

    @Then("^a mensagem de Pedido realizado com sucesso deve ser apresentada$")
    public void aMensagemDePedidoRealizadoComSucessoDeveSerApresentada() {
        Assert.assertEquals("Pedido realizado com sucesso!", paginaCarrinho .validaStatusCompra());
    }

    @And("^o usuario tem a soma do valor dos produtos$")
    public double oUsuarioTemASomaDoValorDosProdutos() {
        Double valorDeTodosProdutosBebida = paginaInicial.somaProdutos();
        return this.valorDeTodosProdutosBebida;
    }

    @And("^o usuario seleciona o produto \"([^\"]*)\"$")
    public void oUsuarioSelecionaOProduto(String produto) throws Throwable {
        paginaInicial.selecionarProdutoEspecifico(produto);
    }

    @And("^o usuario tem o valor do produto \"([^\"]*)\"$")
    public double oUsuarioTemOValorDoProduto(String produto) throws Throwable {
        Double valorDoProduto = paginaInicial.pegarValorProdutoEspecifico(produto);
        return this.valorDoProduto;
    }

    @And("^o usuario diminui a quantidade do produto \"([^\"]*)\" em \"([^\"]*)\"$")
    public void oUsuarioDiminuiAQuantidadeDoProdutoEm(String produto, String arg1) throws Throwable {
        paginaCarrinho.diminuirQuantidadeProduto(produto, 5);
    }

    @And("^o usuario tem a soma dos produtos com suas quantidades$")
    public double oUsuarioTemASomaDosProdutosComSuasQuantidades() {
        Double valorTotal = paginaCarrinho.totalCarrinho(valorDeTodosProdutosBebida, valorDoProduto, 5);
        return this.valorTotal;
    }

    @And("^o usuario tem o valor total do carrinho$")
    public double oUsuarioTemOValorTotalDoCarrinho() {
        double valorTotalDoCarrinho = paginaCarrinho.valorTotalDoCarrinho();
        return this.valorTotalDoCarrinho;
    }

    @Then("^o valor total da compra deve estar correto$")
    public void oValorTotalDaCompraDeveEstarCorreto() {
        Assert.assertTrue(paginaCarrinho .validarValorDoCarrinho(valorTotal, valorTotalDoCarrinho));
    }
}
