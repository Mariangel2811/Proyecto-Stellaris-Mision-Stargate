package factory;

public class NaveExploracion extends Nave {

    public NaveExploracion(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Nave de Exploración: " + nombre);
    }
}