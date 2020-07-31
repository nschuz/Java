package main;

public class Medico extends  Persona {

//Atributos
    private String titulacion;
    private int añosExpreciencia;

    //constructor
    public Medico(String nombre, String apellidos, int edad, String titulacion, int añosExpreciencia) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExpreciencia = añosExpreciencia;
    }

    //setter y getters


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExpreciencia() {
        return añosExpreciencia;
    }

    public void setAñosExpreciencia(int añosExpreciencia) {
        this.añosExpreciencia = añosExpreciencia;
    }

    //metodos abstractos de la clas epadre
    //sobreescribimos

    @Override
    public void partidoFutbol() {
        System.out.println("Da asistencia en partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Da asitencia en el entrenamiento");
    }

    public void curarLesion(){
        System.out.println("Curar Lesion");
    }

}
