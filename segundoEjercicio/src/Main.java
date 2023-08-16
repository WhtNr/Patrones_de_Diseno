// Interfaz de la plataforma existente
interface PlataformaExistente {
    void pagarConTarjetaCredito();
    void pagarConPayPal();
}

// Implementación de la plataforma existente
class PlataformaExistenteImpl implements PlataformaExistente {
    @Override
    public void pagarConTarjetaCredito() {
        // Implementación de pago con tarjeta de crédito
    }

    @Override
    public void pagarConPayPal() {
        // Implementación de pago con PayPal
    }
}

// Interfaz del nuevo sistema de pago
interface NuevoSistemaPago {
    void pagar();
}

// Implementación del nuevo sistema de pago
class NuevoSistemaPagoImpl implements NuevoSistemaPago {
    @Override
    public void pagar() {
        // Implementación de pago con el nuevo sistema
    }
}

// Adaptador para integrar el nuevo sistema de pago con la plataforma existente
class AdaptadorNuevoSistema implements PlataformaExistente {
    private NuevoSistemaPago nuevoSistemaPago;

    public AdaptadorNuevoSistema(NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void pagarConTarjetaCredito() {
        // Adaptación para usar el nuevo sistema de pago
        nuevoSistemaPago.pagar();
    }

    @Override
    public void pagarConPayPal() {
        // Adaptación para usar el nuevo sistema de pago
        nuevoSistemaPago.pagar();
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        PlataformaExistente plataforma = new PlataformaExistenteImpl();
        NuevoSistemaPago nuevoSistema = new NuevoSistemaPagoImpl();
        PlataformaExistente adaptador = new AdaptadorNuevoSistema(nuevoSistema);

        // Ahora puedes usar el adaptador para realizar pagos
        adaptador.pagarConTarjetaCredito();
        adaptador.pagarConPayPal();
    }
}
