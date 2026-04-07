package state;

public class EnEjecucion implements EstadoMision {

    @Override
    public void siguiente(Mision mision) {
        mision.setEstado(new Finalizada());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: En Ejecución");
    }
}