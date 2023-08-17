package alimentos;

import procesamiento.PedidoTemplate;

    public class PedidoAlimentos extends PedidoTemplate {

        @Override
        protected void verificarInventario() {
            // Implementa la lógica para verificar el inventario de productos alimenticios
        }

        @Override
        protected void facturar() {
            // Implementa la lógica de facturación para productos alimenticios
        }

        @Override
        protected void notificarCliente() {
            // Implementa la lógica para notificar al cliente sobre su pedido de productos alimenticios
        }

    }

