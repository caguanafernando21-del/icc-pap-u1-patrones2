package icc.pap.u1.patrones2.builder;
//clase inmutable (que no se puede cambiar)

import java.util.List;

/*
Pizza clase inmutable
Representa una pizza ya configurada
*/
public final class Pizza {
    private final String tamano;
    private final List<String> ingredientes;

    protected Pizza(String tamano, List<String> ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
    }
    public String descripcion(){
        return "Pizza " + tamano + " con: " + ingredientes;
    }


    
    
}
