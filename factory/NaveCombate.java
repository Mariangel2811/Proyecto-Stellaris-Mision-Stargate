package factory;

public class NaveCombate extends Nave {

    public NaveCombate(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Nave de Combate: " + nombre);
    }
}