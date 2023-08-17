package facturacion;
import clientes.Cliente;
public class Factura {
    private int numeroFactura;
    private Cliente cliente;
    private double total;
    public Factura(int numeroFactura, Cliente cliente, double total) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void imprimirFactura() {
        System.out.println("Factura #" + numeroFactura);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total: $" + total);
    }

}
