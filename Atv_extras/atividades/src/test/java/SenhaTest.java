import org.junit.jupiter.api.Test;

import com.example.Senha;

import static org.junit.jupiter.api.Assertions.*;

public class SenhaTest {

    @Test
    public void testSenhaValida() {
        Senha s = new Senha();
        assertTrue(s.senhaValida("12345678"));
        assertFalse(s.senhaValida("abc"));
        assertFalse(s.senhaValida(null));
    }
}
