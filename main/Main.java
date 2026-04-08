package main;

import factory.*;
import adapter.*;
import state.*;
import observer.*;
import utils.*;

public class Main {
    public static void main(String[] args) {

        RegistroMision registro = new RegistroMision();

        // CONFIGURACIÓN
        Nave nave = NaveFactory.crearNave("exploracion", "Orion");
        nave.mostrarTipo();
        registro.agregarEvento("Nave creada");

        // PREPARACIÓN
        SistemaViejo viejo = new SistemaViejo();
        SistemaExterno sistema = new AdaptadorSistema(viejo);
        sistema.activar();
        registro.agregarEvento("Sistema adaptado");

        // OBSERVER
        NaveObservable naveObs = new NaveObservable();
        BaseEspacial base = new BaseEspacial();
        naveObs.agregarObservador(base);
        naveObs.enviarMensaje("Misión iniciada");
        registro.agregarEvento("Mensaje enviado");

        // SIMULACIÓN
        Mision mision = new Mision();
        mision.mostrarEstado();

        // REPORTE
        registro.mostrarReporte();
    
    }

}