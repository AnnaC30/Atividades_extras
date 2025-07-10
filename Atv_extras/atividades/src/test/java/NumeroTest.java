import org.junit.jupiter.api.Test;

import com.example.Numero;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroTest {

    @Test
    public void testParOuImpar() {
        Numero n = new Numero();
        assertEquals("par", n.parOuImpar(2));
        assertEquals("ímpar", n.parOuImpar(3));
    }
}
