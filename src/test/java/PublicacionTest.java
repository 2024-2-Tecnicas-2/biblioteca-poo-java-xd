import com.mycompany.biblioteca.java.Publicacion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PublicacionTest {
    
    @Test
    void toString_shouldReturnCorrectString() {
        Publicacion publicacion = new Publicacion("Mi Publicación", 2023);
        String expected = "Publicacion{titulo=Mi Publicación, anioDePublicacion=2023}";
        assertEquals(expected, publicacion.toString());
    }

    @Test
    void toString_shouldHandleEmptyValues() {
        Publicacion publicacion = new Publicacion("", 0);
        String expected = "Publicacion{titulo=, anioDePublicacion=0}";
        assertEquals(expected, publicacion.toString());
    }
}


