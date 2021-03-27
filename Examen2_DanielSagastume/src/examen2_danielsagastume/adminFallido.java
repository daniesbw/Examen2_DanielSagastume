/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielsagastume;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class adminFallido {

    private ArrayList<Auto> fallidos = new ArrayList();
    private File archivo = null;

    public adminFallido(String path) {
        archivo = new File(path);
    }

    public ArrayList<Auto> getFallidos() {
        return fallidos;
    }

    public void setFallidos(ArrayList<Auto> fallidos) {
        this.fallidos = fallidos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Auto t : fallidos) {
                bw.write(t.getVin() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getBateria().getAutonomia() + ";");
                bw.write(t.getBateria().getMaterial() + ";");
                bw.write(t.getBateria().getTiempo() + ";");
                bw.write(t.getCarroceria().getTipo() + ";");
                bw.write(t.getCarroceria().getCapacidad() + ";");
                bw.write(t.getCarroceria().getTiempo() + ";");
                bw.write(t.getInterior().getMaterial() + ";");
                bw.write(t.getInterior().getTipo_volante() + ";");
                bw.write(t.getInterior().getCant_botones() + ";");
                bw.write(t.getInterior().getTiempo() + ";");
                bw.write(t.getSistema().getCant_pantallas() + ";");
                bw.write(t.getSistema().getVisor() + ";");
                bw.write(t.getSistema().getAncho_pantalla() + ";");
                bw.write(t.getSistema().getTiempo() + ";");
                bw.write(t.getAsientos().getMaterial() + ";");
                bw.write(t.getAsientos().getTipo() + ";");
                bw.write(t.getAsientos().getMasaje() + ";");
                bw.write(t.getAsientos().getTiempo() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     public void cargarArchivo() {
        Scanner sc = null;
        fallidos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    fallidos.add(new Auto(sc.nextInt(), sc.next(), new Bateria(sc.nextInt(), sc.next(),sc.nextInt()), new Carroceria(sc.next(), sc.nextInt(),sc.nextInt()),
                            new Interior(sc.next(), sc.next(), sc.nextInt(),sc.nextInt()), new Sistema(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt()),
                            new Asientos(sc.next(), sc.next(), sc.next(),sc.nextInt())));
                }
            } catch (Exception ex) {
                
            }
            sc.close();
        }//FIN IF
    }
    
}
