package elementos;

import utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.BaseTestes;

import java.util.List;

public class ElementosPaginaInicial extends Utils {

    @FindBy(id = "open-categories-btn")
    protected WebElement buttonCategoria;

    @FindBy(xpath = "//*[@class='sc-EHOje kwbzOF']")
    protected List<WebElement> descricaoProduto;

    @FindBy(xpath = "//*[@class='sc-iwsKbI hCQoxc']")
    protected List<WebElement> adicionarProdutos;

    @FindBy(xpath = "//*[@class='sc-gzVnrw bHRYpN']")
    protected List<WebElement> valorProdutosNaTelaDeCompra;

    public void categoriaElemento(String valor) {
        driver.findElement(By.xpath("//*[contains(text(), '" + valor + "')]")).click();
    }
}
