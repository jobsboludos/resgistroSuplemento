package com.mycompany.registrosdesuplementosdegimnasio;

public class RegistrosdeSuplementosdeGimnasio {
    public static void main(String[] args) {
        // Iniciar la interfaz gráfica
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUP().setVisible(true);
            }
        });
    }
}