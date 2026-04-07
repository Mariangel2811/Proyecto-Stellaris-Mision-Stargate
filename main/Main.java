package main;

import factory.*;
import observer.BaseEspacial;
import observer.NaveObservable;
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

         // OBSERVER
        NaveObservable naveObs = new NaveObservable();
        BaseEspacial base = new BaseEspacial();

        naveObs.agregarObservador(base);
        naveObs.enviarMensaje("Misión iniciada");

        // SIMULACIÓN
        Mision mision = new Mision();
        mision.mostrarEstado();
       
    }

}
