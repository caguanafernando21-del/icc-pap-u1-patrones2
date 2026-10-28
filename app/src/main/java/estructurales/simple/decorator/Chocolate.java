package estructurales.simple.decorator;
/*
DECORADOR que agrega "Cholocate" a la descripcion  
*/
public final class Chocolate implements Bebida {
    protected  final Bebida bebida;

    
    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " Chocolate";
    }

    @Override
    public double precio() {
        return bebida.precio() + 1.0;
    }
    
}
