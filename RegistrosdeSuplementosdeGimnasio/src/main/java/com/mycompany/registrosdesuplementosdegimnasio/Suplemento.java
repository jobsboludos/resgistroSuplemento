/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrosdesuplementosdegimnasio;

/**
 *
 * @author HP
 */
public class Suplemento {
  private String marca;
    private String tipo;
    private double precio;
    private String vencimiento;
    private int id;

    public Suplemento(String marca, String tipo, double precio, String vencimiento, int id) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.vencimiento = vencimiento;
        this.id = id;
    }

    // Getters y Setters para cada atributo
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getVencimiento() { return vencimiento; }
    public void setVencimiento(String vencimiento) { this.vencimiento = vencimiento; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

}
