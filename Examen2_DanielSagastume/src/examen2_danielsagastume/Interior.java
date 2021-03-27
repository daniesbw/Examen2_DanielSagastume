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
public class Interior {

    private String material;
    private String tipo_volante;
    private int cant_botones;
    private int tiempo;
    public Interior() {
    }

    public Interior(String material, String tipo_volante, int cant_botones, int tiempo) {
        this.material = material;
        this.tipo_volante = tipo_volante;
        this.cant_botones = cant_botones;
        this.tiempo = tiempo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo_volante() {
        return tipo_volante;
    }

    public void setTipo_volante(String tipo_volante) {
        this.tipo_volante = tipo_volante;
    }

    public int getCant_botones() {
        return cant_botones;
    }

    public void setCant_botones(int cant_botones) {
        this.cant_botones = cant_botones;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

   
    @Override
    public String toString() {
        return "Interior{" + "material=" + material + ", tipo_volante=" + tipo_volante + ", cant_botones=" + cant_botones + '}';
    }
    
}
