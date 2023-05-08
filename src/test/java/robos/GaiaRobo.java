package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    private ChromeDriver julioDriver;

    public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();

    }
    public void acessarUmSiteChamado(String site){
        julioDriver.get(site);

    }
    public String pegarOTituloDaPagina(){
        return julioDriver.getTitle();
    }
    public void fazerLogin(String login, String senha){

    }

    public void lancarNota(){
        System.out.println("Vou lancar nota!");

    }
}
