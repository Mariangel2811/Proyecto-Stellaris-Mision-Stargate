package observer;

public class BaseEspacial implements Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[BASE] Mensaje recibido: " + mensaje);
    }
}