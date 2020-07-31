package main;

public class Pesona {
private  String nombre;
private  int edad;
private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Pesona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pesona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
