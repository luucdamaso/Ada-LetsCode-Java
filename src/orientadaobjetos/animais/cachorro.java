package orientadaobjetos.animais;

public class cachorro extends animal {
    //atributos

    static int numeroDeCachorros;

    private int tamanhoDoRabo;
    
    //construtores

    public cachorro(){};
    public cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    };

    //metodos

    public static int getNumeroDeCachorros(){
        return numeroDeCachorros;
    };

    public int gettamanhoDoRabo(){
        return this.tamanhoDoRabo;
    };

    public void settamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    };

    public String pegar(){
        return "Bolinha";
    };

    public String interagir(String acao){

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "vai dormir!":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "Triste";
                break;
            default:
            this.estadoDeEspirito = "Neutro";
                break;
        }
            return this.estadoDeEspirito;


        // if ("carinho".equalsIgnoreCase(acao)) {
        //     this.estadoDeEspirito = "Feliz";
        // } else if (acao.equalsIgnoreCase("Vai dormir!")){
        //     this.estadoDeEspirito = "Bravo";
        // } else {
        //     this.estadoDeEspirito = "Neutro";
        // } 
        // return estadoDeEspirito;
    };

    public String toString() {
        return "cachorro{" + "nome='" + nome + '\'' + '}';
    };

    public void soar() {
        System.out.println("Au Au");
    };

}
