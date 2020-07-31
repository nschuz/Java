package main;

public  abstract class Persona {

    protected  String nombre;
    protected  String apellidos;
    protected int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //todos viajan
    public void viajar(){

    }

    //metodo abstracta porque cada quien lo hace diferente
    //por ende la clase debe ser abstracta
    public  abstract  void partidoFutbol();
    public  abstract  void entrenamiento();

}
