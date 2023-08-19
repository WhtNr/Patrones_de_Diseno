package electronica;

import procesamiento.PedidoTemplate;

public class PedidoElectronica extends PedidoTemplate {
    @Override
    protected void verificarInventario() {
        // lógica para verificar el inventario de productos electrónicos
    }

    @Override
    protected void facturar() {
        // lógica de facturación para productos electrónicos
    }

    @Override
    protected void notificarCliente() {
        // lógica para notificar al cliente sobre su pedido de productos electrónicos
    }
}
