package alimentos;

import procesamiento.PedidoTemplate;

    public class PedidoAlimentos extends PedidoTemplate {

        @Override
        protected void verificarInventario() {
            // lógica para verificar el inventario de productos alimenticios
        }

        @Override
        protected void facturar() {
            // lógica de facturación para productos alimenticios
        }

        @Override
        protected void notificarCliente() {
            // lógica para notificar al cliente sobre su pedido de productos alimenticios
        }

    }

