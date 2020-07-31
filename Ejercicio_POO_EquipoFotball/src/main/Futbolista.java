package main;

public class Futbolista extends  Persona {


    //atributos
    private int dorsal;
    private  String posicion;

    //generamos el constructor
    public Futbolista(String nombre, String apellidos, int edad, int dorsal, String posicion) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    //settrs y getters


    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //implemnetamos los metodos abtsctados simpre de la lcase padre
    @Override
    public void partidoFutbol() {
        System.out.println("Juega el partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Entrena");
    }

    public void entrevista(){
        System.out.println("Da una entrevista");
    }

}
