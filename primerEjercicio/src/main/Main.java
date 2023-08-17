package main;

import alimentos.PedidoAlimentos;
import clientes.Cliente;
import clientes.NotificacionCliente;
import facturacion.Factura;
import procesamiento.ProcesadorPedido;
import ropa.PedidoRopa;
import electronica.PedidoElectronica;
public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Maria", "Dirección1", "maria@gmail.com");
        Cliente cliente2 = new Cliente("Juan", "Dirección2", "juan@gmail.com");

        // Crear pedidos
        PedidoElectronica pedidoElectronica = new PedidoElectronica();
        PedidoAlimentos pedidoAlimentos = new PedidoAlimentos();
        PedidoRopa pedidoRopa = new PedidoRopa();

        // Procesar pedidos
        ProcesadorPedido procesador = new ProcesadorPedido();
        procesador.procesar(pedidoElectronica);
        procesador.procesar(pedidoAlimentos);
        procesador.procesar(pedidoRopa);

        // Crear factura
        Factura factura = new Factura(1, cliente1, 100.0); // Número de factura, cliente y total

        // Enviar notificación al cliente
        NotificacionCliente notificacionCliente = new NotificacionCliente();
        notificacionCliente.enviarNotificacion(cliente1, "Su pedido ha sido procesado y la factura se encuentra adjunta.");

        // Imprimir factura
        factura.imprimirFactura();
    }






        }
