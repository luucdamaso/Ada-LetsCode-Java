package orientadaobjetos.animais;

public class gato extends animal {
    static int numeroDeGatos;


    public gato(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos ++;
    };

    public String toString() {
        return "gato{" + "nome='" + nome + '\'' + '}';
    };

    public void soar() {
        System.out.println("Miau Miau");
    };

}
