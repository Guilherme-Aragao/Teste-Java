package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class executora {
    public static void main(String[] args){
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarUmSiteChamado("http://www.juliodelima.com.br/taskit/");
        umaGaiaRobo.fazerLogin("senha","1234");
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarUmSiteChamado("https://www.google.com.br");


    }
}
