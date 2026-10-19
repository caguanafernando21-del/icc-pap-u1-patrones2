package icc.pap.u1.patrones2;

public class SingletonDemo {
    
    // Variable estatica privada para una sola instancia
    private static SingletonDemo instanciaUnica; 
    
    private String mensaje;

    //  Constructor privado para evitar que se instancie con el operador con new
    private SingletonDemo() { // evitar que se use el new 
        mensaje = "Instancia del programa";
    }

    // dar acceso para instanciar
    public static SingletonDemo obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new SingletonDemo();
        }
        return instanciaUnica;
    }

    // Metodo para mostrar el funcionamiento
    public void mostrarMensaje() {
        System.out.println("Mensaje desde Singleton: " + mensaje);
        System.out.println("HashCode de esta instancia: " + this.hashCode());
    }
}