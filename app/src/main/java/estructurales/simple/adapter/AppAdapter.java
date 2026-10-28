package estructurales.simple.adapter;
public class AppAdapter {
 
    //*
    // Adaper: permite usar un termometro Fahrenheit con una aplocacon que espera
    // celsius 
    // */
    public static void main(String[] args) {
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cUsb = new AdaptadorCargador(cAntiguo); 
    
        CargadorInalambrico cInalambrico = new CargadorInalambrico();

        Cargador cargor2 = new AdaptadorCargadorina(cInalambrico);
        cUsb.cargarCelular();

        System.out.println("=== Caso 1. Cargador antiguo con registro ===");
        Cargador c1 = new DecoradorRegistro(new AdaptadorCargador(new CargadorAntiguo()));
        c1.cargarCelular();

        System.out.println("=== Caso 2. Cargador inalámbrico con seguridad permitida ===");
        Cargador c2 = new DecoradorSeguridad(new AdaptadorCargadorina(new CargadorInalambrico()), true);
        c2.cargarCelular();

        System.out.println("=== Caso 3. Cargador antiguo con seguridad bloqueada ===");
        Cargador c3 = new DecoradorSeguridad(new AdaptadorCargador(new CargadorAntiguo()), false);
        c3.cargarCelular();

        System.out.println("=== Caso 4. Cargador inalámbrico con dos decoradores ===");
      
        Cargador c4 = new DecoradorSeguridad(
                          new DecoradorRegistro(
                              new AdaptadorCargadorina(new CargadorInalambrico())
                          ), 
                      true);
        c4.cargarCelular();
    
    
    }
}
