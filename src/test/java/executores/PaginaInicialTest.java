package executores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robos.GaiaRobo;

@DisplayName("Classe de teste para a pagina inicial")
public class PaginaInicialTest {
    @Test
    @DisplayName("Validando se o titulo da pagina esta correto")
    public void validarTituloDaPagina(){
        GaiaRobo gaiaTiaDoJonas = new GaiaRobo();

        gaiaTiaDoJonas.acessarUmSiteChamado("http://www.juliodelima.com.br/taskit/");

        String tituloDaPagina = gaiaTiaDoJonas.pegarOTituloDaPagina();

        Assertions.assertEquals("Task it!", tituloDaPagina);
    }

}
