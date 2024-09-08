import com.mycompany.biblioteca.java.Revista;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class RevistaTest {
    
    @Test
    void toString_shouldReturnCorrectString() {
        Revista revista = new Revista("National Geographic", 2023, 12, "Naturaleza");
        String expected = "Publicacion{titulo=National Geographic, anioDePublicacion=2023}Revista{numeroDeRevista=12, nombreDeRevista=Naturaleza}";
        assertEquals(expected, revista.toString());
    }

    @Test
    void toString_shouldHandleEmptyValues() {
        Revista revista = new Revista("", 0, 0, "");
        String expected = "Publicacion{titulo=, anioDePublicacion=0}Revista{numeroDeRevista=0, nombreDeRevista=}";
        assertEquals(expected, revista.toString());
    }
    
    
}

