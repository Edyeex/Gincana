public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public String getNomeGincana(String nomeGincana){
        return nomeGincana;
    }
    public int getTotalEstudantes(int totalEstudantes){
        return totalEstudantes;
    }
    public int getPontuacaoMaxima(int pontuacaoMaxima){
        return pontuacaoMaxima;
    }
    public Estudante getEstudanteVencedor(){
        return estudanteVencedor;
    }

    public void setNomeGincana(){
        this.nomeGincana = nomeGincana;
    }
    public void setTotalEstudantes(){
        this.totalEstudantes = totalEstudantes;
    }
    public void setPontuacaoMaxima(){
        this.pontuacaoMaxima = pontuacaoMaxima;
    }
    public void setEstudanteVencedor(Estudante estudanteVencedor){
        this.estudanteVencedor = estudanteVencedor;
    }

    public void adicionarEstudante(Estudante estudante){
    this.totalEstudantes ++;
    if (estudante.getPontos() > pontuacaoMaxima){
        estudanteVencedor = estudante;
        pontuacaoMaxima = estudante.getPontos();
    }
    }
    public void exibirVencedor(){
        System.out.println("Nome: " + this.estudanteVencedor.getNome());
        System.out.println("Idade: " + this.estudanteVencedor.getIdade());
        System.out.println("Pontuação: " + this.pontuacaoMaxima);
    }
}
