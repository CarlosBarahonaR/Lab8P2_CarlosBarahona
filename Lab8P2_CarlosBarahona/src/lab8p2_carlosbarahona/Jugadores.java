/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlosbarahona;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Jugadores implements Serializable {

    private ArrayList<Items> items;
    private ArrayList<Mascotas> mascotas;
    private int dinero;
    private int dineroBanco;

    public Jugadores(ArrayList<Items> items, ArrayList<Mascotas> mascotas, int dinero, int dineroBanco) {
        this.items = items;
        this.mascotas = mascotas;
        this.dinero = dinero;
        this.dineroBanco = dineroBanco;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDineroBanco() {
        return dineroBanco;
    }

    public void setDineroBanco(int dineroBanco) {
        this.dineroBanco = dineroBanco;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "items=" + items + ", mascotas=" + mascotas + ", dinero=" + dinero + ", dineroBanco=" + dineroBanco + '}';
    }

}
