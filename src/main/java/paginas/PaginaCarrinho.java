package paginas;

import elementos.ElementosCarrinho;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaCarrinho extends ElementosCarrinho {

    public PaginaCarrinho(){
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void aumentarQuantidadeProdutoNovo(String valor, int quantidade){
        int count = listaProdutosNoCarrinho.size();
        for (int i = 0; i < count; i++) {
            String value = listaProdutosNoCarrinho.get(i).getText();

            if (value.contains(valor)) {
                for (int j = 0; j < quantidade; j++) {
                    aumentarQuantidadeProduto.get(i).click();
                }
            }
        }
    }

    public void diminuirQuantidadeProduto(String valor, int quantidade){
        int count = listaProdutosNoCarrinho.size();
        for (int i = 0; i < count; i++) {
            String value = listaProdutosNoCarrinho.get(i).getText();

            if (value.contains(valor)) {
                for (int j = 0; j < quantidade; j++) {
                    diminuirQuantidadeProduto.get(i).click();
                }
            }
        }
    }

    public Double valorTotalDoCarrinho(){
        double valorTotal = 0.00;
        String valor = valorTotalCarrinho.getText();
        String parts = valor.replace("R$ ","");
        String parts1 = parts.replace(",",".");
        try{
            valorTotal = Double.parseDouble(parts1);
        }catch(NumberFormatException ex){};
        return valorTotal;
    }

    public boolean validarValorDoCarrinho(double valordosProdutos,double valorTotalNoCarrinho){
        boolean value;
        if(valordosProdutos == valorTotalNoCarrinho){
            value = true;
        }else value = false;
        return value;
    }

    public double totalCarrinho(double SomaProdutos, Double valorProduto, int quantidade){
        Double total = 0.00;
        Double valorProdutoLocal = valorProduto;
        total = (SomaProdutos + valorProdutoLocal * quantidade);
        return total;
    }

    public void finalizarCompra(){

        finalizarCompraButton.click();
    }

    public String validaStatusCompra(){

        return statusPedido.getText();
    }

    public void fecharMensagemStatusPedido(){

        fecharMensagemButton.click();
    }
}
