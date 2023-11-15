package orientadaobjetos.lojas;

import orientadaobjetos.animais.animal;
import orientadaobjetos.animais.cachorro;

public class petshop {
    
    public void darBanho( animal animal) {
        animal.setEstadoDeEspiro("Limpo");
    };

    public void tosar(cachorro cachorro) {
        cachorro.setEstadoDeEspiro("Tosado");
    };

    public void deixarNoHotel( animal animal) {
        animal.setEstadoDeEspiro("Com saudade");
    };

}
