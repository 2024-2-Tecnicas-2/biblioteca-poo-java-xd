import com.mycompany.biblioteca.java.Libro;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class LibroTest {
    
     @Test
    void toString_shouldReturnCorrectString() {
        Libro libro = new Libro("El señor de los anillos", 1954, "J.R.R. Tolkien", 1178);
        String expected = "Publicacion{titulo=El señor de los anillos, anioDePublicacion=1954}Libro{autor=J.R.R. Tolkien, numeroDePaginas=1178}";
        assertEquals(expected, libro.toString());
    }

    @Test
    void toString_shouldHandleEmptyValues() {
        Libro libro = new Libro("", 0, "", 0);
        String expected = "Publicacion{titulo=, anioDePublicacion=0}Libro{autor=, numeroDePaginas=0}";
        assertEquals(expected, libro.toString());
    }
}

