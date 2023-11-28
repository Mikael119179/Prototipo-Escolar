import java.time.LocalDate;
class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void atribuirPontos(Aluno aluno, Atividade atividade, int pontos) {
        aluno.adicionarPontos(pontos);
        atividade.setConcluida(true);
        System.out.println("Pontos atribuídos com sucesso!");
    }

    public void atribuirPrazo(Atividade atividade, LocalDate prazo) {
        atividade.setPrazo(prazo);
        System.out.println("Prazo atribuído com sucesso!");
    }
}