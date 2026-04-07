package state;

public class Finalizada implements EstadoMision {

    @Override
    public void siguiente(Mision mision) {
        System.out.println("La misión ya finalizó.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado: Finalizada");
    }
}