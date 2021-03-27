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
public class Ensamblador {
    private int id;
    private String nombre;
    private String genero;
    private int edad;
    private int cant_vehiculos;

    public Ensamblador() {
    }

    public Ensamblador(int id, String nombre, String genero, int edad, int cant_vehiculos) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.cant_vehiculos=cant_vehiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCant_vehiculos() {
        return cant_vehiculos;
    }

    public void setCant_vehiculos(int cant_vehiculos) {
        this.cant_vehiculos = cant_vehiculos;
    }

    @Override
    public String toString() {
        return "Ensamblador{" + "id=" + id + ", nombre=" + nombre + ", cant_vehiculos=" + cant_vehiculos + '}';
    }

    
    
}
