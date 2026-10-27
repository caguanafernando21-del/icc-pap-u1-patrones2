package icc.pap.u1.patrones2.practica;


public final class PedidoLinea extends Pedido {

    public PedidoLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected String obtenerTipoPedido() {
        return "en línea";
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Confirmación digital generada.");
    }
}