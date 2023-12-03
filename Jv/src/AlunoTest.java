import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void getPontos() {
        Aluno aluno = new Aluno("Maria");

        aluno.adicionarPontos(5);

        aluno.adicionarPontos(8);

        assertEquals(13, aluno.getPontos());
    }
}
