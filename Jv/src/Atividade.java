import java.time.LocalDate;
class Atividade {
    private String nome;
    private int pontos;
    private LocalDate prazo;
    private boolean concluida;

    public Atividade(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}