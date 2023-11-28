import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ranking {
    private ArrayList<Aluno> alunos;
    private ArrayList<Atividade> atividades;
    private Professor professor;

    public Ranking(Professor professor) {
        this.alunos = new ArrayList<>();
        this.atividades = new ArrayList<>();
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void exibirRanking() {
        Collections.sort(alunos, Comparator.comparing(Aluno::getPontos).reversed());

        System.out.println("Ranking:");

        int posicao = 1;

        for (Aluno aluno : alunos) {
            String posicaoPodio;

            if (posicao == 1) {
                posicaoPodio = "1°";
            } else if (posicao == 2) {
                posicaoPodio = "2°";
            } else if (posicao == 3) {
                posicaoPodio = "3°";
            } else {
                posicaoPodio = Integer.toString(posicao);
            }

            System.out.println(posicaoPodio + " " + aluno.getNome() + ": " + aluno.getPontos() + " pontos");

            posicao++;
        }
    }
}