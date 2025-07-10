import org.junit.jupiter.api.Test;

import com.example.Pessoa;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa();
        assertTrue(pessoa.ehMaiorDeIdade(18));
        assertTrue(pessoa.ehMaiorDeIdade(25));
        assertFalse(pessoa.ehMaiorDeIdade(17));
    }
}
