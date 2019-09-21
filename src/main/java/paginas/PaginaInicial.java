package paginas;

import elementos.ElementosPaginaInicial;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaInicial extends ElementosPaginaInicial {

    public PaginaInicial(){
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }
    public void selecionarCategoria(String categoria){
        buttonCategoria.click();
        categoriaElemento(categoria);
    }

    public void adicionarTodosProdutosNoCarrinho() {
        int count = adicionarProdutos.size();
        for (int i = 0; i < count; i++) {
            adicionarProdutos.get(i).click();
        }
    }
    public void selecionarProdutoEspecifico(String valor) {
        int count = descricaoProduto.size();
        for (int i = 0; i < count; i++) {
            String value = descricaoProduto.get(i).getText();
            if (value.contains(valor)) {
                adicionarProdutos.get(i).click();
            }
        }
    }
    public double somaProdutos(){
        Double valor = 0.00;
        int count = valorProdutosNaTelaDeCompra.size();
        for (int i = 0; i < count; i++) {

            String teste = valorProdutosNaTelaDeCompra.get(i).getText();
            String parts = teste.replace("R$ ","");
            String parts1 = parts.replace(",",".");
            try{
                valor += Double.parseDouble(parts1);
            }catch(NumberFormatException ex){};
            System.out.println(valor);
        }
        return valor;
    }
    public double pegarValorProdutoEspecifico(String valor) {
        double valorDoProduto = 0.00;
        int count = descricaoProduto.size();
        for (int i = 0; i < count; i++) {
            String value = descricaoProduto.get(i).getText();
            if (value.contains(valor)) {
                String valorDoProdutoString = valorProdutosNaTelaDeCompra.get(i).getText();
                String parts = valorDoProdutoString.replace("R$ ", "");
                try{
                    String parts1 = parts.replace(",", ".");
                    valorDoProduto = Double.parseDouble(parts1);
                }catch(NumberFormatException ex){};
            }
        }
        return valorDoProduto;
    }

}
