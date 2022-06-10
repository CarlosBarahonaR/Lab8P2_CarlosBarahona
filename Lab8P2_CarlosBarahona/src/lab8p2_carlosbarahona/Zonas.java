/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Zonas {

    private int idZona;
    private String nombre;
    private ArrayList<Items> items;
    private String remuneracion;
    private int probabilidadDerrumbe;
    private int probabilidadAtaque;

    public Zonas(int idZona, String nombre, ArrayList<Items> items, String remuneracion, int probabilidadDerrumbe, int probabilidadAtaque) {
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

    public int getProbabilidadDerrumbe() {
        return probabilidadDerrumbe;
    }

    public void setProbabilidadDerrumbe(int probabilidadDerrumbe) {
        if (probabilidadDerrumbe >= 0 && probabilidadDerrumbe <= 100) {
            this.probabilidadDerrumbe = probabilidadDerrumbe;
        } else {
            JOptionPane.showMessageDialog(null, "La probabilidad de derrumbe debe de tener el rango entre 0 - 100.");
        }

    }

    public int getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public void setProbabilidadAtaque(int probabilidadAtaque) {
        if (probabilidadAtaque >= 0 && probabilidadAtaque <= 100) {
            this.probabilidadAtaque = probabilidadAtaque;
        } else {
            JOptionPane.showMessageDialog(null, "La probabilidad de ataque de megalodon debe de tener el rango entre 0 - 100.");
        }

    }

    @Override
    public String toString() {
        return "Zonas{" + "idZona=" + idZona + ", nombre=" + nombre + ", items=" + items + ", remuneracion=" + remuneracion + ", probabilidadDerrumbe=" + probabilidadDerrumbe + ", probabilidadAtaque=" + probabilidadAtaque + '}';
    }

}
