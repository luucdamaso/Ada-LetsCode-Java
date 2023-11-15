package orientadaobjetos;

import orientadaobjetos.animais.animal;
import orientadaobjetos.animais.cachorro;
import orientadaobjetos.animais.gato;
import orientadaobjetos.animais.passaro;
import orientadaobjetos.lojas.petshop;

public class classes {
    public static void main(String[] args) {

        gato gato1 = new gato("Alex", "dourado", 15, 9.2, "nada");

        animal gato2 = new gato("frajola", "preto", 15, 5.5, "nada");

        cachorro cachorro1 = new cachorro("Atila", "preto", 22, 15.2, 7, "nada");

        animal passaro1 = new passaro("falcon", "branco", 5, 0.200, "nada");

        cachorro1.soar();
        gato1.soar();
        gato2.soar();
        passaro1.soar();

        petshop petshop = new petshop();

        petshop.deixarNoHotel(cachorro1);
        System.out.println(cachorro1.getestadoDeEspirito());


        // System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        // System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
    }
}
