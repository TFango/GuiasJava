import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private double total;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double total, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.total = total;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public UUID getId() { return id; }

    public double getTotal() { return total; }

    public LocalDateTime getFecha() { return fecha; }

    public Cliente getCliente() { return cliente; }


    public double calcularDescuento(){
        double descuento = (cliente.getpDescuento());
        double montoDescuento = total * (descuento / 100);
        return total - montoDescuento;
    }


    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", total=" + total +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }



}
