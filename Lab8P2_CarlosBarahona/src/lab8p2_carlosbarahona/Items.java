/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Items {

    private int idItem;
    private String nombre;
    private boolean alimento;
    private int probabilidad;
    private int costo;

    public Items(int idItem, String nombre, boolean alimento, int probabilidad, int costo) {
        this.idItem = idItem;
        this.nombre = nombre;
        this.alimento = alimento;
        this.probabilidad = probabilidad;
        this.costo = costo;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlimento() {
        return alimento;
    }

    public void setAlimento(boolean alimento) {
        this.alimento = alimento;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        if (probabilidad >= 0 && probabilidad <= 100) {
            this.probabilidad = probabilidad;
        } else {
            JOptionPane.showMessageDialog(null, "La probabilidad debe de tener el rango entre 0 - 100.");
        }

    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Items{" + "idItem=" + idItem + ", nombre=" + nombre + ", alimento=" + alimento + ", probabilidad=" + probabilidad + ", costo=" + costo + '}';
    }

}
