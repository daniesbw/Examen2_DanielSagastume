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
public class adminEnsamblador {

    private ArrayList<Ensamblador> ensamblador = new ArrayList();
    private File archivo = null;

    public adminEnsamblador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ensamblador> getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(ArrayList<Ensamblador> ensamblador) {
        this.ensamblador = ensamblador;
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
            for (Ensamblador t : ensamblador) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getGenero() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getCant_vehiculos() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ensamblador = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ensamblador.add(new Ensamblador(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
