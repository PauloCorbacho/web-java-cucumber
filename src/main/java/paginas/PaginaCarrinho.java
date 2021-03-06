package paginas;

import elementos.ElementosPaginaCarrinho;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaCarrinho extends ElementosPaginaCarrinho {

    public PaginaCarrinho(){
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void aumentarQuantidadeProduto(String valor, int quantidade){
        int count = listaProdutosNoCarrinho.size();
        for (int i = 0; i < count; i++) {
            String nomeProduto = listaProdutosNoCarrinho.get(i).getText();

            if (nomeProduto.contains(valor)) {
                for (int j = 0; j < quantidade; j++) {
                    aumentarQuantidadeProduto.get(i).click();
                }
            }
        }
    }

    public void diminuirQuantidadeProduto(String valor, int quantidade){
        int count = listaProdutosNoCarrinho.size();
        for (int i = 0; i < count; i++) {
            String nomeProduto = listaProdutosNoCarrinho.get(i).getText();

            if (nomeProduto.contains(valor)) {
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
        boolean auxBoolean;
        if(valordosProdutos == valorTotalNoCarrinho){
            auxBoolean = true;
        }else auxBoolean = false;
        return auxBoolean;
    }

    public double totalCarrinho(double somaProdutos, Double valorProduto, int quantidade){
        Double total = 0.00;
        Double valorProdutoLocal = valorProduto;
        total = (somaProdutos + valorProdutoLocal * quantidade);
        return total;
    }

    public void finalizarCompra(){

        botaoFinalizarCompra.click();
    }

    public String validaStatusCompra(){

        return statusPedido.getText();
    }

    public void fecharMensagemStatusPedido(){

        botaoFecharMensagem.click();
    }
}
