package introducao;
public class condicionais {
    public static void main(String[] args) {
        int nota = 70;
        // Se nota maior ou igual a 70, então aprovado
        // if-else

        // if (nota >= 70){
        //     System.out.println("Aluno Aprovado!");
        // } else {
        //     System.out.println("Aluno Reprovado!");
        // }

            if (nota >= 80) {
                System.out.println("Graduação A");
            }else if (nota < 80 && nota >= 70) {
                System.out.println("Graduação B");
            } else if (nota < 70 && nota >= 60) {
                System.out.println("Graduação C");
            } else if (nota < 60 && nota >= 0) {
                System.out.println("D");
            } 
    }
}
