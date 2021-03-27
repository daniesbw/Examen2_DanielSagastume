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
public class Sistema {

    private int cant_pantallas;
    private String visor;
    private int ancho_pantalla;
    private int tiempo;
    public Sistema() {
    }

    public Sistema(int cant_pantallas, String visor, int ancho_pantalla, int tiempo) {
        this.cant_pantallas = cant_pantallas;
        this.visor = visor;
        this.ancho_pantalla = ancho_pantalla;
        this.tiempo = tiempo;
    }

    public int getCant_pantallas() {
        return cant_pantallas;
    }

    public void setCant_pantallas(int cant_pantallas) {
        this.cant_pantallas = cant_pantallas;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAncho_pantalla() {
        return ancho_pantalla;
    }
    
    

    public void setAncho_pantalla(int ancho_pantalla) {
        this.ancho_pantalla = ancho_pantalla;
    }
    
}
