import Acciones.Nadar;

public class Pez extends Animal implements Nadar {

    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return super.comer();
    }

    @Override
    public String dormir() {
        return super.dormir();
    }

    @Override
    public String emitirSonido() {
        return super.emitirSonido("");
    }

    @Override
    public void nadar() {

    }
}
