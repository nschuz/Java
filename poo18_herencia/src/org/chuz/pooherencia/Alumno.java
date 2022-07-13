package org.chuz.pooherencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematica;
    private double notaCatellano;
    private double notaHIstoria;

    public Alumno(){
        System.out.println("Inicializando constructor alumno .... ");
    }

    public Alumno(String nombre , String apellido){
        //se lo mandamos al constructor del padre
        super(nombre, apellido);

    }


    public Alumno(String nombre , String apellido , int edad){
        super(nombre, apellido , edad);
    }


    public Alumno(String nombre , String apellido , int edad, String institucion){
        super(nombre, apellido , edad);
        this.institucion = institucion;
    }


    public Alumno (String nombre , String apellido, int edad , String institucion, double notaMatematica , double notaCatellano){
        this(nombre, apellido ,edad, institucion);
        this.notaCatellano=notaCatellano;
        this.notaMatematica=notaMatematica;
    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCatellano() {
        return notaCatellano;
    }

    public void setNotaCatellano(double notaCatellano) {
        this.notaCatellano = notaCatellano;
    }

    public double getNotaHIstoria() {
        return notaHIstoria;
    }

    public void setNotaHIstoria(double notaHIstoria) {
        this.notaHIstoria = notaHIstoria;
    }
}
