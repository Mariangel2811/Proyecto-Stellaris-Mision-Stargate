package factory;

public class NaveFactory {

    public static Nave crearNave(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "exploracion":
                return new NaveExploracion(nombre);
            case "combate":
                return new NaveCombate(nombre);
            default:
                throw new IllegalArgumentException("Tipo de nave no válido");
        }
    }
}