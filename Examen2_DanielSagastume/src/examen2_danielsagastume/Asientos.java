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
public class Asientos {
    private String material;
    private String tipo;
    private String masaje;
    private int tiempo;
    public Asientos() {
    }

    public Asientos(String material, String tipo, String masaje, int tiempo) {
        this.material = material;
        this.tipo = tipo;
        this.masaje = masaje;
        this.tiempo = tiempo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getMasaje() {
        return masaje;
    }
    public void setMasaje(String masaje) {
        this.masaje = masaje;
    }
    

    
}
