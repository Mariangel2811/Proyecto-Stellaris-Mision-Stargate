package state;

public class Preparacion implements EstadoMision {

    @Override
    public void siguiente(Mision mision) {
        mision.setEstado(new EnEjecucion());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: Preparación");
    }
}