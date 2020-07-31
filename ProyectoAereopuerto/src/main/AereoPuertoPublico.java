package main;

public class AereoPuertoPublico extends AereoPuerto {
    private double subvencion;

    //Tres constuctores


    public AereoPuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AereoPuertoPublico(String nombre, String ciudad, String pais, Compañia[] c, double subvencion) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    public AereoPuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }



}

