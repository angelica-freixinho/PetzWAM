package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;  // objeto do selenium WebDriver, vulgo bola (um de cada vez pelo protected)
    // ^ - ao usar PageFactory  mudar de public para protected

    // v - criar um construtor e inicializar os elementos da PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // faz o mapeamento do elemento com a ação
    }
}
