package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
    @Given("^o usuario esta acessando a seguinte pagina \"([^\"]*)\"$")
    public void oUsuarioEstaAcessandoASeguintePagina(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^o usuario seleciona a seguinte categoria \"([^\"]*)\"$")
    public void oUsuarioSelecionaASeguinteCategoria(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^o usuario adiciona todos os produtos disponiveis ao carrinho$")
    public void oUsuarioAdicionaTodosOsProdutosDisponiveisAoCarrinho() {
    }

    @And("^o usuario aumenta a quantidade do produto \"([^\"]*)\" em \"([^\"]*)\"$")
    public void oUsuarioAumentaAQuantidadeDoProdutoEm(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^o usuario clica no botao finalizar compra$")
    public void oUsuarioClicaNoBotaoFinalizarCompra() {
    }

    @And("^o usuario fecha a modal$")
    public void oUsuarioFechaAModal() {

    }

    @Then("^a mensagem de Pedido realizado com sucesso deve ser apresentada$")
    public void aMensagemDePedidoRealizadoComSucessoDeveSerApresentada() {
    }
}
