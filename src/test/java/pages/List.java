package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {

    // 1 - Mapeamento
    // Texto do Resultado Para
    @FindBy(css = "h1.h2Categoria.nomeCategoria")
    private WebElement lblResultBy;

    // .liProduct:nth-child(1) a:nth-child(2)
    //@FindBy(xpath = "//h3[contains(text(), 'Aquário Boyu Preto MT 50 80 Litros']")

    // 2 - Construtor
    public List(WebDriver driver) {
        super(driver);
    }

    // 3 - Métodos e Funções baseados no Mapeamento (assert so tem no steps)
    // Le o titulo da guia e devolve o texto encontrado
    public String readTitleTab(){
        return driver.getTitle();
    }

    // Le a frase Resultado para "Produto"
    public String readResultBy(){
        return lblResultBy.getText();
    }
    // Clique no produto desejado
    public void clickAtDesiredProduct(String product) {
        driver.findElement(By.xpath("//h3[contains(text(), '" + product + "')]")).click();

    }
}
