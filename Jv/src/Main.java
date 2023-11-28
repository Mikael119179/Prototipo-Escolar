import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Silva");

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Galvão");
        Aluno aluno4 = new Aluno("Pedro");


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

        agendaProfessor.atribuirPontos("João", "Atividade 1");
        agendaProfessor.atribuirPontos("Maria", "Atividade 2");
        agendaProfessor.atribuirPontos("Galvão", "Atividade 3");
        agendaProfessor.atribuirPontos("Pedro", "Atividade 4");

        agendaProfessor.exibirPontuacaoAluno("Pedro");

        agendaProfessor.exibirRanking();
    }
}
