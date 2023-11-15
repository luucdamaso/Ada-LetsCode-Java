package orientadaobjetos;

import animais.cachorro;

public class classes {
    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro("Chopper", "laranja", 55, 15.2, 5, "nada");

        System.out.println(cachorro.getNumeroDeCachorros());

        cachorro cachorro2 = new cachorro("R2D2", "laranja", 55, 15.2, 5, "nada");

        System.out.println(cachorro.getNumeroDeCachorros());
        System.out.println(cachorro.getNumeroDeCachorros());


        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        // cachorro1.latir();

        // System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        // System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
    }
}
