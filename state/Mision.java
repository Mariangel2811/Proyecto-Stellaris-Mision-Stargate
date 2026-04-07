package state;

public class Mision {

    private EstadoMision estado;

    public Mision() {
        estado = new Preparacion();
    }

    public void setEstado(EstadoMision estado) {
        this.estado = estado;
    }

    public void avanzar() {
        estado.siguiente(this);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }
}