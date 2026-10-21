package icc.pap.u1.patrones2.factoryMethod;

public class ImportadorPuntoComa extends Importador{
         
    
    @Override 
    public LecturaLinea crearLector(){
        return new LectorPuntoComa();
    }
}
