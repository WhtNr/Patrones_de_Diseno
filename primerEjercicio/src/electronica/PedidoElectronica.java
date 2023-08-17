package electronica;

import procesamiento.PedidoTemplate;

public class PedidoElectronica extends PedidoTemplate {
    @Override
    protected void verificarInventario() {
        // Implementa la lógica para verificar el inventario de productos electrónicos
    }

    @Override
    protected void facturar() {
        // Implementa la lógica de facturación para productos electrónicos
    }

    @Override
    protected void notificarCliente() {
        // Implementa la lógica para notificar al cliente sobre su pedido de productos electrónicos
    }
}
