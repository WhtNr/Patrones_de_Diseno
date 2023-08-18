package ropa;

import procesamiento.PedidoTemplate;

public class PedidoRopa extends PedidoTemplate {
    @Override
    protected void verificarInventario() {
        // lógica para verificar el inventario de productos de ropa
    }

    @Override
    protected void facturar() {
        //lógica de facturación para productos de ropa
    }

    @Override
    protected void notificarCliente() {
        //lógica para notificar al cliente sobre su pedido de productos de ropa
    }

}
