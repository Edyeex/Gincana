public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.setNome("João");
        estudante1.setPontos(20);
        estudante1.setIdade(14);

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Pedro");
        estudante2.setPontos(17);
        estudante2.setIdade(16);

        Estudante estudante3 = new Estudante();
        estudante3.setNome("Mateus");
        estudante3.setPontos(22);
        estudante3.setIdade(15);



        Gincana gincana = new Gincana();
        gincana.adicionarEstudante(estudante1);
        gincana.adicionarEstudante(estudante2);
        gincana.adicionarEstudante(estudante3);
        gincana.exibirVencedor();

    }

}
