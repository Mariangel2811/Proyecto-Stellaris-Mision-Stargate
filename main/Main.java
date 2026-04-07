package main;

import factory.*;
import adapter.*;
import state.*;

public class Main {
    public static void main(String[] args) {

        // CONFIGURACIÓN
        Nave nave = NaveFactory.crearNave("exploracion", "Orion");
        nave.mostrarTipo();

        // PREPARACION (ADAPTER)
        SistemaViejo viejo = new SistemaViejo();
        SistemaExterno sistema = new AdaptadorSistema(viejo);
        sistema.activar();

        // SIMULACION (STATE)
        Mision mision = new Mision();

        mision.mostrarEstado();
        mision.avanzar();
        mision.mostrarEstado();

    }

}
