package icc.pap.u1.patrones2.factoryMethod;

public class LectorTabulacion implements LecturaLinea {

    @Override
    public Lectura leerLinea(String linea) {
            String[] partes = linea.split("\t");
            return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);
    
        }
  

   


    
    
} 

