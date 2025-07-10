import org.junit.jupiter.api.Test;

import com.example.Aluno;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testVerificarSituacao() {
        Aluno aluno = new Aluno();
        assertEquals("Aprovado", aluno.verificarSituacao(7.0));
        assertEquals("Recuperação", aluno.verificarSituacao(5.5));
        assertEquals("Reprovado", aluno.verificarSituacao(4.9));
    }
}
