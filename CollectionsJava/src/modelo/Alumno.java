package modelo;

import java.util.Objects;

public class Alumno  implements Comparable<Alumno>{

    private String nombre;
    private int nota;


    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Alumno alumno) {

        if (this.nombre==null){
            return 0;
        }

        return this.nombre.compareTo(alumno.nombre);
    }

    @Override
    public boolean equals(Object o) {
        //compara por instancia
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        //Object una clase helper
        return nota == alumno.nota && Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
