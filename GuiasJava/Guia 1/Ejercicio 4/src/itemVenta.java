public class itemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public itemVenta(int identificador, String descripcion, int cantidad, double precioUnitario){
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdentificador(){ return identificador; }
    public void setIdentificador( int identificador) { this.identificador = identificador; }

    public String getDescripcion(){ return descripcion; }
    public void setDescripcion(String descripcion){ this.descripcion = descripcion; }

    public int getCantidad(){ return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario(){ return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario){ this.precioUnitario = precioUnitario; }

    public double calcularPrecioTotal(){return cantidad * precioUnitario;}


    @Override
    public String toString() {
        return "itemVenta{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
           '}';
}
}