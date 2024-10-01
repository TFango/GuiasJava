import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private double pDescuento;

    public Cliente(String nombre, String email, double pDescuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.pDescuento = pDescuento;
    }

    public UUID getId() { return id; }

    public String getNombre() { return nombre; }

    public String getEmail() { return email; }

    public double getpDescuento() { return pDescuento; }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", pDescuento='" + pDescuento + '\'' +
                '}';
    }

}
