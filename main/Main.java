package main;

import factory.*;
import adapter.*;
import state.*;
import observer.*;
import utils.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RegistroMision registro = new RegistroMision();

        // CONFIGURACIÓN
        System.out.print("Ingrese tipo de nave: ");
        String tipo = sc.nextLine();

        System.out.print("Nombre de la nave: ");
        String nombre = sc.nextLine();

        Nave nave = NaveFactory.crearNave(tipo, nombre);
        nave.mostrarTipo();
        registro.agregarEvento("Nave creada: " + nombre);

        // PREPARACIÓN
        SistemaViejo viejo = new SistemaViejo();
        SistemaExterno sistema = new AdaptadorSistema(viejo);
        sistema.activar();
        registro.agregarEvento("Sistema adaptado");

        // OBSERVER
        NaveObservable naveObs = new NaveObservable();
        BaseEspacial base = new BaseEspacial();
        naveObs.agregarObservador(base);

        // SIMULACIÓN
        Mision mision = new Mision();

        int opcion;

        do {
            System.out.println("\n1. Ver estado");
            System.out.println("2. Avanzar misión");
            System.out.println("3. Enviar mensaje");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    mision.mostrarEstado();
                    break;

                case 2:
                    mision.avanzar();
                    registro.agregarEvento("Cambio de estado");
                    break;

                case 3:
                    System.out.print("Mensaje: ");
                    String msg = sc.nextLine();
                    naveObs.enviarMensaje(msg);
                    registro.agregarEvento("Mensaje enviado: " + msg);
                    break;
            }

        } while (opcion != 4);

        // REPORTE FINAL
        registro.mostrarReporte();
        mision.mostrarEstado();

        sc.close();
    }
}