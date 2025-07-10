

import org.junit.jupiter.api.Test;

import com.example.Desconto;

import static org.junit.jupiter.api.Assertions.*;

public class DescontoTest {

    @Test
    public void testCalcularDesconto() {
        Desconto d = new Desconto();
        assertEquals(10.0, d.calcularDesconto(100.01), 0.01);
        assertEquals(5.0, d.calcularDesconto(100), 0.01);
    }
}
