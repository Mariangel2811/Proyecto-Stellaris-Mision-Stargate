package utils;

import java.util.ArrayList;
import java.util.List;

public class RegistroMision {

    private List<String> eventos = new ArrayList<>();

    public void agregarEvento(String evento) {
        eventos.add(evento);
    }

    public void mostrarReporte() {
        System.out.println("\n--- REPORTE DE MISIÓN ---");
        for (String e : eventos) {
            System.out.println("- " + e);
        }
    }
}
