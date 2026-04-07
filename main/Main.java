package main;

import factory.*;

public class Main {
    public static void main(String[] args) {

        // CONFIGURACIÓN
        Nave nave = NaveFactory.crearNave("exploracion", "Orion");
        nave.mostrarTipo();
    }
}