package icc.pap.u1.patrones2.practica;



public abstract class Pedido {
    protected String codigo;
    protected String cliente;
    protected double subtotal;

    protected Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public void procesar() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        double valorImpuesto = this.subtotal * (config.getImpuesto() / 100.0);
        double total = this.subtotal + valorImpuesto;

        System.out.println("--- Pedido " + obtenerTipoPedido() + " --- Código: " + codigo);
        System.out.println("Cliente: " + cliente + " Subtotal: $" + subtotal + 
                           " Impuesto: $" + valorImpuesto + " Total: $" + total);
        
        generarComprobante();
    }

    protected abstract String obtenerTipoPedido();
    protected abstract void generarComprobante();

    // Factory Method integrado
    public static Pedido crearPedido(String tipo, String codigo, String cliente, double subtotal) {
        if (tipo.equalsIgnoreCase("PRESENCIAL")) {
            return new PedidoPresencial(codigo, cliente, subtotal);
        } else if (tipo.equalsIgnoreCase("EN_LINEA")) {
            return new PedidoLinea(codigo, cliente, subtotal);
        }
        throw new IllegalArgumentException("Tipo de pedido desconocido: " + tipo);
    }
}