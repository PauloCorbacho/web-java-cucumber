package elementos;

import utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.BaseTestes;


import java.util.List;

public class ElementosPaginaCarrinho extends Utils {

    @FindBy(xpath = "//*[contains(@id, 'add')]")
    protected List<WebElement> aumentarQuantidadeProduto;

    @FindBy(xpath = "//*[contains(@id, 'remove')]")
    protected List<WebElement> diminuirQuantidadeProduto;

    @FindBy(xpath = "//*[@class='sc-fMiknA BpYZx']")
    protected List<WebElement> listaProdutosNoCarrinho;

    @FindBy(xpath = "//*[@class='sc-dNLxif jyncPa']")
    protected WebElement statusPedido;

    @FindBy(xpath = "//*[@class='close-modal sc-jqCOkK ippulb']")
    protected WebElement fecharMensagemButton;

    @FindBy(id = "finish-checkout-button")
    protected WebElement finalizarCompraButton;

    @FindBy(id = "subtotal-price")
    protected WebElement valorTotalCarrinho;
}
