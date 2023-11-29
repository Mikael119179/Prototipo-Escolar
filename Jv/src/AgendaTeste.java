import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;

public class AgendaTeste {

    @Test
    public void testExibirPontuacaoAluno() {
        Aluno aluno = new Aluno("Mikael");
        Atividade atividade = new Atividade("Atividade 1", 10);
        Agenda agenda = new Agenda();
        agenda.adicionarAluno(aluno);
        agenda.adicionarAtividade(atividade);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        agenda.atribuirPontos("Mikael", "Atividade 1");

        agenda.exibirPontuacaoAluno("Mikael");

        System.setOut(System.out);

        assertTrue(outContent.toString().contains("Pontuação do ganhador Mikael: 10 pontos"));
    }
}
