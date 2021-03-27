/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielsagastume;

/**
 *
 * @author Daniel
 */
public class Bateria {
    private int autonomia;
    private String material;
    private int tiempo;
    public Bateria() {
    }

    public Bateria(int autonomia, String material, int tiempo) {
        this.autonomia = autonomia;
        this.material = material;
        this.tiempo = tiempo;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
    @Override
    public String toString() {
        return "Bateria{" + "autonomia=" + autonomia + ", material=" + material + '}';
    }
    
}
