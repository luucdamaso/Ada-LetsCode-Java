package orientadaobjetos;

import animais.cachorro;
import animais.passaro;
import animais.gato;

public class classes {
    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro("Chopper", "laranja", 55, 15.2, 5, "nada");

        cachorro cachorro2 = new cachorro("R2D2", "laranja", 55, 15.2, 5, "nada");

        passaro passaro1 = new passaro("falcon", "branco", 5, 0.2, "nada");

        gato gato1 = new gato("Alex", "dourado", 15, 9.2, "nada");


        cachorro1.soar();
        cachorro2.soar();
        passaro1.soar();
        gato1.soar();

        // System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        // System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
    }
}
