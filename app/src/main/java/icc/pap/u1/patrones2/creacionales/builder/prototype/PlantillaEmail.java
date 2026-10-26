package icc.pap.u1.patrones2.prototype;


public class PlantillaEmail implements Copiable {
    private  String asunto;
    private  String mensaje;
    
    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    @Override 
    public Object copia(){
        return new PlantillaEmail(asunto, mensaje); 
    }

    public PlantillaEmail clone() {
        return new PlantillaEmail(asunto, mensaje);
    }
    //SETTER asunto -> con  otro nombre para que tenga mayor sentido
    public void cambiarAsunto(String newAsunto){
        this.asunto = newAsunto;
    }

    
    //getter del toString -> con otro nombre
    public String contenido(){
        return this.toString();
    }
    
    @Override
    public String toString() {
        return asunto + ": " + mensaje;
    }

    
}