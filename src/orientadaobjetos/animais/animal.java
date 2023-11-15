package orientadaobjetos.animais;

public abstract class animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

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

     public String getestadoDeEspirito(){
        return this.estadoDeEspirito;
    };

    public void setEstadoDeEspiro(String estadoDeEspirito){
        this.estadoDeEspirito = estadoDeEspirito;
    };

    protected void comer(){

    };

    protected void dormir(){
        
    };

    public abstract void soar();
}
