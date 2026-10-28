package estructurales.simple.decorator;
/*
Leche es Decorador que envuelve a una bebida
Bebida -> General puede ser cualquiera como un cafe 
un expreso, chocolate
Decorador 
*/

import java.security.ProtectionDomain;

public final class Leche implements Bebida {
    protected final Bebida bebida;

    public Leche(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + "  leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.50;
    }
    
}
