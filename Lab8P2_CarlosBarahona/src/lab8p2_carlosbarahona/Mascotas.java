/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Mascotas implements Serializable {

    private String nombre;
    private int ptsVida;
    private int delay;
    private int costo;
    private Color color;

    public Mascotas(String nombre, int ptsVida, int delay, int costo, Color color) {
        this.nombre = nombre;
        this.ptsVida = ptsVida;
        this.delay = delay;
        this.costo = costo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPtsVida() {
        return ptsVida;
    }

    public void setPtsVida(int ptsVida) {
        if (ptsVida % 200 == 0) {
            this.ptsVida = ptsVida;
        } else {
            JOptionPane.showMessageDialog(null, "La vida debe de ser un múltiplo de 200.");
        }

    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        if (delay % 100 == 0) {
            this.delay = delay;
        } else {
            JOptionPane.showMessageDialog(null, "El delay debe de ser un múltiplo de 100.");
        }

    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", ptsVida=" + ptsVida + ", delay=" + delay + ", costo=" + costo + ", color=" + color + '}';
    }

}
