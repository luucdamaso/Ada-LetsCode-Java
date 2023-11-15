package animais;

public class passaro extends animal {
    static int numeroDePassaros;


    public passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDePassaros ++;
    };


    public String toString() {
        return "passaro{" + "nome='" + nome + '\'' + '}';
    };

    public void soar() {
        System.out.println("Piu Piu");
    };
}
