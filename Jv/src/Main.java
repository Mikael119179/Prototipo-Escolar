import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do Professor: ");
        String nomeProfessor = scanner.nextLine();
        Professor professor = new Professor(nomeProfessor);

        System.out.print("Informe o nome do primeiro Aluno: ");
        String nomeAluno1 = scanner.nextLine();
        Aluno aluno1 = new Aluno(nomeAluno1);

        System.out.print("Informe o nome do segundo Aluno: ");
        String nomeAluno2 = scanner.nextLine();
        Aluno aluno2 = new Aluno(nomeAluno2);

        System.out.print("Informe o nome do terceiro Aluno: ");
        String nomeAluno3 = scanner.nextLine();
        Aluno aluno3 = new Aluno(nomeAluno3);

        System.out.print("Informe o nome do quarto Aluno: ");
        String nomeAluno4 = scanner.nextLine();
        Aluno aluno4 = new Aluno(nomeAluno4);

        Agenda agendaProfessor = new Agenda();
        agendaProfessor.adicionarAluno(aluno1);
        agendaProfessor.adicionarAluno(aluno2);
        agendaProfessor.adicionarAluno(aluno3);
        agendaProfessor.adicionarAluno(aluno4);

        System.out.print("Informe o nome da primeira Atividade: ");
        String nomeAtividade1 = scanner.nextLine();
        Atividade atividade1 = new Atividade(nomeAtividade1, 0);

        System.out.print("Informe o nome da segunda Atividade: ");
        String nomeAtividade2 = scanner.nextLine();
        Atividade atividade2 = new Atividade(nomeAtividade2, 0);

        System.out.print("Informe o nome da terceira Atividade: ");
        String nomeAtividade3 = scanner.nextLine();
        Atividade atividade3 = new Atividade(nomeAtividade3, 0);

        System.out.print("Informe o nome da quarta Atividade: ");
        String nomeAtividade4 = scanner.nextLine();
        Atividade atividade4 = new Atividade(nomeAtividade3, 0);

        agendaProfessor.adicionarAtividade(atividade1);
        agendaProfessor.adicionarAtividade(atividade2);
        agendaProfessor.adicionarAtividade(atividade3);
        agendaProfessor.adicionarAtividade(atividade4);

        System.out.print("Informe o prazo da primeira Atividade (no formato Ano-Mês-Dia): ");
        String prazoAtividade1 = scanner.nextLine();
        atividade1.setPrazo(LocalDate.parse(prazoAtividade1));

        System.out.print("Informe o prazo da segunda Atividade (no formato Ano-Mês-Dia): ");
        String prazoAtividade2 = scanner.nextLine();
        atividade2.setPrazo(LocalDate.parse(prazoAtividade2));

        System.out.print("Informe o prazo da terceira Atividade (no formato Ano-Mês-Dia): ");
        String prazoAtividade3 = scanner.nextLine();
        atividade3.setPrazo(LocalDate.parse(prazoAtividade3));

        System.out.print("Informe o prazo da quarta Atividade (no formato Ano-Mês-Dia): ");
        String prazoAtividade4 = scanner.nextLine();
        atividade4.setPrazo(LocalDate.parse(prazoAtividade4));

        System.out.print("Informe os pontos para " + aluno1.getNome() + ": ");
        int pontosAluno1 = scanner.nextInt();
        aluno1.adicionarPontos(pontosAluno1);

        System.out.print("Informe os pontos para " + aluno2.getNome() + ": ");
        int pontosAluno2 = scanner.nextInt();
        aluno2.adicionarPontos(pontosAluno2);

        System.out.print("Informe os pontos para " + aluno3.getNome() + ": ");
        int pontosAluno3 = scanner.nextInt();
        aluno3.adicionarPontos(pontosAluno3);

        System.out.print("Informe os pontos para " + aluno4.getNome() + ": ");
        int pontosAluno4 = scanner.nextInt();
        aluno4.adicionarPontos(pontosAluno4);


        System.out.print("Informe o nome do aluno para exibir a pontuação: ");
        scanner.nextLine();
        String nomeAluno = scanner.nextLine();
        agendaProfessor.exibirPontuacaoAluno(nomeAluno);

        System.out.println("Exibindo Ranking:");
        agendaProfessor.exibirRanking();
        scanner.close();
    }
}
