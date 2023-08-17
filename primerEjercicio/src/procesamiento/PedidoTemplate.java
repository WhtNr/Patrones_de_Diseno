package procesamiento;

public abstract class PedidoTemplate {
    public final void procesarPedido() {
        verificarInventario();
        facturar();
        notificarCliente();
    }

    protected abstract void verificarInventario();

    protected abstract void facturar();

    protected abstract void notificarCliente();
}

