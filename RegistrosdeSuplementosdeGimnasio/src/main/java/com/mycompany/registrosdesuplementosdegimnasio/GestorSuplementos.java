package com.mycompany.registrosdesuplementosdegimnasio;

import java.util.ArrayList;

public class GestorSuplementos {
    private ArrayList<Suplemento> suplementos;

    public GestorSuplementos() {
        suplementos = new ArrayList<>();
    }

    public void agregarSuplemento(Suplemento suplemento) {
        suplementos.add(suplemento);
    }

    public Suplemento buscarSuplementoPorId(int id) {
        for (Suplemento suplemento : suplementos) {
            if (suplemento.getId() == id) {
                return suplemento;
            }
        }
        return null;
    }

    public void eliminarSuplemento(int id) {
        Suplemento suplemento = buscarSuplementoPorId(id);
        if (suplemento != null) {
            suplementos.remove(suplemento);
        }
    }

    public String mostrarSuplementos() {
        StringBuilder sb = new StringBuilder();
        for (Suplemento suplemento : suplementos) {
            sb.append(suplemento.toString()).append("\n");
        }
        return sb.toString();
    }
}
