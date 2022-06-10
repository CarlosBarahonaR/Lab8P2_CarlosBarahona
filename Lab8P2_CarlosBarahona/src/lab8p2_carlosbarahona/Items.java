/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Items {

    private int idItem;
    private String nombre;
    private boolean alimento;
    private double probabilidad;
    private int costo;

    public Items(int idItem, String nombre, boolean alimento, double probabilidad, int costo) {
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

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
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
