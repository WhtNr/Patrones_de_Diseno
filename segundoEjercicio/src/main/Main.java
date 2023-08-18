package main;

import adaptadores.AdaptadorNuevoSistema;
import plataforma.*;

public class Main {
    public static void main(String[] args) {
        PlataformaExistente tarjeta = new MedioPagoTarjeta();
        PlataformaExistente paypal = new MedioPagoPayPal();
        NuevoSistemaPago nuevoPago = new MedioPagoNuevo();
        PlataformaExistente adaptador = new AdaptadorNuevoSistema(nuevoPago);

        tarjeta.realizarPago(1.0);
        paypal.realizarPago(2.0);
        adaptador.realizarPago(3.0);
    }
}
