package adaptadores;

import plataforma.*;

public class AdaptadorNuevoSistema implements PlataformaExistente {
    final private NuevoSistemaPago nuevoSistemaPago;

    public AdaptadorNuevoSistema(NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void realizarPago(double monto) {
        nuevoSistemaPago.hacerTransaccion(monto);
    }
}

