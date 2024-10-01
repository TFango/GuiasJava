public class CuentaBancaria {
    private String nombre;
    private String identificador;
    private double balance;

    public CuentaBancaria(String nombre, String identificador, double balance){
        this.nombre = nombre;
        this.identificador = identificador;
        this.balance = balance;
    }

    public String getNombre(){ return nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getIdentificador(){ return identificador; }
    public void setIdentificador(String identificador){ this.identificador = identificador; }

    public double getBalance(){ return balance; }
    public void setBalance(double balance){ this.balance = balance; }

    public double credito (double deposito){
        balance += deposito;
        return balance;
    }

    public double debito (double extraccion){
        double dineroRestante = balance - extraccion;

        if(dineroRestante >= 0){
            balance -= extraccion;
        }else {
            System.out.println("El dinero de la cuenta no es suficiente para la extraccion.");
        }
        return balance;
    }

    public String mostrarInfo(){
        return "Cuenta Bancaria" + "Nombre: " + nombre + "\nIdentificador: " + identificador + "\nBalance: " + balance;
    }




}
