package main;

public class Pasajero {
    //Atributos
    private String nombre;
    private String pasaporte;
    private String nacionalida;

    //Constructor
    public Pasajero(String nombre, String pasaporte, String nacionalida) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalida = nacionalida;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }
}
