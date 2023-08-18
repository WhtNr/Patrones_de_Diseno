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
        Cliente cliente1 = new Cliente("M", "Dirección1", "m@gmail.com");
        Cliente cliente2 = new Cliente("J", "Dirección2", "j@gmail.com");

        PedidoElectronica pedidoElectronica = new PedidoElectronica();
        PedidoAlimentos pedidoAlimentos = new PedidoAlimentos();
        PedidoRopa pedidoRopa = new PedidoRopa();

        ProcesadorPedido procesador = new ProcesadorPedido();
        procesador.procesar(pedidoElectronica);
        procesador.procesar(pedidoAlimentos);
        procesador.procesar(pedidoRopa);

        Factura factura = new Factura(1, cliente1, 100.0); // Número de factura, cliente y total

        NotificacionCliente notificacionCliente = new NotificacionCliente();
        notificacionCliente.enviarNotificacion(cliente1, "Su pedido ha sido procesado y la factura se encuentra adjunta.");

        factura.imprimirFactura();
    }






        }
