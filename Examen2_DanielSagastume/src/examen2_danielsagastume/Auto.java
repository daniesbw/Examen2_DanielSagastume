package examen2_danielsagastume;

/**
 *
 * @author Daniel
 */
public class Auto {
    private int vin;
    private String color;
    private Bateria bateria;
    private Carroceria carroceria;
    private Interior interior;
    private Sistema sistema;
    private Asientos asientos;

    public Auto() {
    }

    public Auto(int vin, String color, Bateria bateria, Carroceria carroceria, Interior interior, Sistema sistema, Asientos asientos) {
        this.vin = vin;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.sistema = sistema;
        this.asientos = asientos;
    }


    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Auto{" + "vin=" + vin + ", color=" + color + '}';
    }
    
}
