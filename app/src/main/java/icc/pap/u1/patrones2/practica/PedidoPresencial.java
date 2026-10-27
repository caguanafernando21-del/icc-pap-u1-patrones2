package icc.pap.u1.patrones2.practica;



public final class PedidoPresencial extends Pedido {

    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected String obtenerTipoPedido() {
        return "presencial";
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante generado en tienda.");
    }
}