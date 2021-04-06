package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1 - Mapeamento de Elementos
    @FindBy(id = "search")
    private WebElement txtinputSearch; // define um apelido para o elemento

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;  // mapeou a lupa tipo botão dando um apelido

    // 2 - Construtor
    public Home(WebDriver driver) {
        super(driver);
    }
    // 3 - Ações dos Elementos
    public void search (String product){
        txtinputSearch.click(); // clicar na caixa de pesquisa
        txtinputSearch.clear(); // limpar o conteudo da caixa de texto
        txtinputSearch.sendKeys(product); // escreve na caixa de texto
    }

    // Feature ---> steps ---> searchWith... ---> search

    public void searchWithMagnifierButton(String product) {
        search(product);
        btnSearch.click(); // clicar no botão da lupa
    }

    public void searchWithEnter(String product){
        search(product);
        txtinputSearch.sendKeys(Keys.ENTER);

    }
}
