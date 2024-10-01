public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public String comer(){
        return nombre + " esta comiendo";
    }

    public String dormir(){
        return nombre + " esta dormido";
    }

    public String emitirSonido(){
        return nombre + " emite sonido";
    }
}
