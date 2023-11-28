class Aluno {
    private String nome;
    private int pontos;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public void visualizarPontuacao() {
        System.out.println("Pontuação de " + nome + ": " + pontos + " pontos");
    }
}