/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Zonas {

    private int idZona;
    private String nombre;
    private ArrayList<Items> items;
    private String remuneracion;
    private double probabilidadDerrumbe;
    private double probabilidadAtaque;

    public Zonas(int idZona, String nombre, ArrayList<Items> items, String remuneracion, double probabilidadDerrumbe, double probabilidadAtaque) {
        this.idZona = idZona;
        this.nombre = nombre;
        this.items = items;
        this.remuneracion = remuneracion;
        this.probabilidadDerrumbe = probabilidadDerrumbe;
        this.probabilidadAtaque = probabilidadAtaque;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public String getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(String remuneracion) {
        this.remuneracion = remuneracion;
    }

    public double getProbabilidadDerrumbe() {
        return probabilidadDerrumbe;
    }

    public void setProbabilidadDerrumbe(double probabilidadDerrumbe) {
        this.probabilidadDerrumbe = probabilidadDerrumbe;
    }

    public double getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public void setProbabilidadAtaque(double probabilidadAtaque) {
        this.probabilidadAtaque = probabilidadAtaque;
    }

    @Override
    public String toString() {
        return "Zonas{" + "idZona=" + idZona + ", nombre=" + nombre + ", items=" + items + ", remuneracion=" + remuneracion + ", probabilidadDerrumbe=" + probabilidadDerrumbe + ", probabilidadAtaque=" + probabilidadAtaque + '}';
    }

}
