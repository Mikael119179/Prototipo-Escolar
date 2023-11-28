import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Agenda {
    private ArrayList<Aluno> alunos;
    private ArrayList<Atividade> atividades;

    public Agenda() {
        this.alunos = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void atribuirPontos(String nomeAluno, String nomeAtividade) {
        Aluno aluno = procurarAluno(nomeAluno);
        Atividade atividade = procurarAtividade(nomeAtividade);

        if (aluno != null && atividade != null) {
            aluno.adicionarPontos(atividade.getPontos());
            System.out.println("Pontos atribuídos com sucesso!");
        } else {
            System.out.println("Aluno ou atividade não encontrados.");
        }
    }

    public void exibirPontuacaoAluno(String nomeAluno) {
        Aluno aluno = procurarAluno(nomeAluno);

        if (aluno != null) {
            System.out.println("Pontuação do ganhador " + aluno.getNome() + ": " + aluno.getPontos() + " pontos");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void exibirRanking() {
        Collections.sort(alunos, Comparator.comparing(Aluno::getPontos).reversed());

        System.out.println("Pódio:");

        int posicao = 1;

        for (Aluno aluno : alunos) {
            String posicaoPodio = (posicao == 1) ? "1°" : (posicao == 2) ? "2°" : (posicao == 3) ? "3°" : Integer.toString(posicao);

            System.out.println(posicaoPodio + " " + aluno.getNome() + ": " + aluno.getPontos() + " pontos");

            posicao++;
        }
    }

    private Aluno procurarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    private Atividade procurarAtividade(String nome) {
        for (Atividade atividade : atividades) {
            if (atividade.getNome().equals(nome)) {
                return atividade;
            }
        }
        return null;
    }
}