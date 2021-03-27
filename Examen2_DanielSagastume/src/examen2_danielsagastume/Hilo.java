package examen2_danielsagastume;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hilo extends Thread {

    private JTable tabla;
    private Auto auto;
    private Ensamblador ensamblador;
    private int probabilidad;
    private boolean vive;

    public Hilo(JTable tabla, Auto auto, Ensamblador ensamblador, int probabilidad) {
        this.tabla = tabla;
        this.auto = auto;
        this.ensamblador = ensamblador;
        this.probabilidad = probabilidad;
        vive = true;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Ensamblador getEnsamblador() {
        return ensamblador;
    }

    public void setEnsamblador(Ensamblador ensamblador) {
        this.ensamblador = ensamblador;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        int pieza=0;
        int tiempo = 0;
        JOptionPane.showMessageDialog(tabla, probabilidad);
        while (vive) {
            Random random = new Random();
            int num = random.nextInt(100);
            JOptionPane.showMessageDialog(tabla, num);
            if (num <= probabilidad) {
                try {
                    vive=false;
                    adminFallido au=new adminFallido("./fallidos.txt");
                    au.cargarArchivo();
                    au.getFallidos().add(auto);
                    au.escribirArchivo();
                    JOptionPane.showMessageDialog(tabla, "Ensamble fallido");
                } catch (IOException ex) {
                }
            } else {
                DefaultTableModel  model=(DefaultTableModel)tabla.getModel();
                if (pieza==0) {
                    Object[] nextrow={"Bateria",
                        "Instalado"
                    };
                    model.addRow(nextrow);
                    pieza++;
                    tiempo=auto.getBateria().getTiempo();
                }
                else if(pieza==1){
                    Object[] nextrow={"Carroceria",
                        "Instalado"
                    };
                    model.addRow(nextrow);
                    pieza++;
                    tiempo=auto.getCarroceria().getTiempo();
                }else if(pieza==2){
                    Object[] nextrow={"Interior",
                        "Instalado"
                    };
                    model.addRow(nextrow);
                    pieza++;
                    tiempo=auto.getInterior().getTiempo();
                }else if(pieza==3){
                    Object[] nextrow={"Sistema de infoentretenimiento",
                        "Instalado"
                    };
                    model.addRow(nextrow);
                    pieza++;
                    tiempo=auto.getSistema().getTiempo();
                }else if(pieza==4){
                    tiempo=auto.getAsientos().getTiempo();
                    Object[] nextrow={"Asientos",
                        "Instalado"
                    };
                    model.addRow(nextrow);
                    pieza++;
                    JOptionPane.showMessageDialog(tabla, "Auto ensamblado");
                    vive=false;
                }
            }
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                
            }
        }
        
    }
}
