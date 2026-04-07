package main;

import factory.*;
import adapter.*;

public class Main {
    public static void main(String[] args) {

        // CONFIGURACIÓN
        Nave nave = NaveFactory.crearNave("exploracion", "Orion");
        nave.mostrarTipo();

        // PREPARACION (ADAPTER)
        SistemaViejo viejo = new SistemaViejo();
        SistemaExterno sistema = new AdaptadorSistema(viejo);
        sistema.activar();
        
    }
}