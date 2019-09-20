package paginas;


import elementos.ElementosPaginaInicial;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class Paginas extends ElementosPaginaInicial {

    public Paginas(){
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void acessarPagina(String pagina) {
        driver.get("https://shopcart-challenge.4all.com/" + pagina);
    }
}

