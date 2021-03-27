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
public class Carroceria {
    private String tipo;
    private int capacidad;
    private int tiempo;
    public Carroceria() {
    }

    public Carroceria(String tipo, int capacidad, int tiempo) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    @Override
    public String toString() {
        return "Carroceria{" + "tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
    
}
