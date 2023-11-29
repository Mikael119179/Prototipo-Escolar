import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Silva");

        Aluno aluno1 = new Aluno("Mikael");
        Aluno aluno2 = new Aluno("Galvão");
        Aluno aluno3 = new Aluno("Pedro");
        Aluno aluno4 = new Aluno("Marcio");

        Agenda agendaProfessor = new Agenda();
        agendaProfessor.adicionarAluno(aluno1);
        agendaProfessor.adicionarAluno(aluno2);
        agendaProfessor.adicionarAluno(aluno3);
        agendaProfessor.adicionarAluno(aluno4);

        Atividade atividade1 = new Atividade("Atividade 1", 10);
        Atividade atividade2 = new Atividade("Atividade 2", 15);
        Atividade atividade3 = new Atividade("Atividade 3", 5);
        Atividade atividade4 = new Atividade("Atividade 4", 20);

        agendaProfessor.adicionarAtividade(atividade1);
        agendaProfessor.adicionarAtividade(atividade2);
        agendaProfessor.adicionarAtividade(atividade3);
        agendaProfessor.adicionarAtividade(atividade4);

        atividade1.setPrazo(LocalDate.of(2023, 12, 1));
        atividade2.setPrazo(LocalDate.of(2023, 12, 15));
        atividade3.setPrazo(LocalDate.of(2023, 12, 23));
        atividade4.setPrazo(LocalDate.of(2023, 12, 30));

        agendaProfessor.atribuirPontos("Mikael", "Atividade 1");
        agendaProfessor.atribuirPontos("Galvão", "Atividade 2");
        agendaProfessor.atribuirPontos("Pedro", "Atividade 3");
        agendaProfessor.atribuirPontos("Marcio", "Atividade 4");

        agendaProfessor.exibirPontuacaoAluno("Mikael");

        agendaProfessor.exibirRanking();
    }
}

