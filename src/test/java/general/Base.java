package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public WebDriver driver;  // objeto do selenium WebDriver, vulgo bola
    // ^ - ao usar PageFactory  mudar de public para protected ==> quando se tem muitos elementos com complexidade maior no codigo

    // v - criar um construtor e inicializar os elementos da PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // faz o mapeamento do elemento com a ação
    }
}
