package factory;

public abstract class Nave {
    protected String nombre;

    public Nave(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarTipo();
}