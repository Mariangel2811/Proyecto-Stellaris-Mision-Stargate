package observer;

import java.util.ArrayList;
import java.util.List;

public class NaveObservable {

    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void enviarMensaje(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}