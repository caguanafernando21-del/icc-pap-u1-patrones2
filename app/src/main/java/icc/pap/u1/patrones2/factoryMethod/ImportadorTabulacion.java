package icc.pap.u1.patrones2.factoryMethod;

import java.util.ArrayList;
import java.util.List;


public class ImportadorTabulacion extends Importador {

    @Override
    protected LecturaLinea crearLector() {
        return new LectorPuntoComa();
    }
    

}
