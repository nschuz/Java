package main;

public class Entrenador extends Persona {

    //Atributos
    private String estrategia;

    //constructor
    public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }



    //Definimos los metodos abstcatos
    @Override
    public void partidoFutbol() {
        System.out.println("Dirije  el partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirije un entrenamiento");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificar el entrenamiento");
    }
}
