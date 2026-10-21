//mantener el proceso de importación o delegada la creación
package icc.pap.u1.patrones2.factoryMethod;
import java.util.ArrayList;
import java.util.List;

public abstract class Importador {
    //Factory method
    protected abstract LecturaLinea crearLector();
    List<Lectura> resultado = new ArrayList<>();

    public final List<Lectura> importacion(List<String> lecturas){
        LecturaLinea lector = crearLector(); //polimorfica
        List<Lectura> resultado = new ArrayList<>();
        for(String lectura : lecturas){
            if(lectura.isBlank())
                continue;
            try{
                resultado.add(lector.leerLinea(lectura));

            }catch(Exception e){
                throw new IllegalArgumentException("Linea mal formada");
            }
        }
        return resultado;
    };
}
