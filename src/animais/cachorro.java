package animais;

public class cachorro {
    //atributos

    static int numeroDeCachorros;

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;
    
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

    public String getnome(){
        return this.nome;
    };

    public void setNome(String nome){
        this.nome = nome;
    };

    public String getcor(){
        return this.cor;
    };

    public void setcor(String cor){
        this.cor = cor;
    };

    public int getaltura(){
        return this.altura;
    };

    public void setaltura(int altura){
        this.altura = altura;
    };

    public double getpeso(){
        return this.peso;
    };

    public void setpeso(double peso){
        this.peso = peso;
    };

    public int gettamanhoDoRabo(){
        return this.tamanhoDoRabo;
    };

    public void settamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    };

    public void comer(){};

    public void latir(){
        System.out.println("AU AU");
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

}
