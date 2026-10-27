package icc.pap.u1.patrones2.practica;



public class ConfiguracionSistema {
    // Patron SINGLETON
    
    //  Instancia unica
    private static ConfiguracionSistema instancia;
    private double impuesto;

    private ConfiguracionSistema() {
        this.impuesto = 15.0; // Valor por defecto
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }
    
    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}