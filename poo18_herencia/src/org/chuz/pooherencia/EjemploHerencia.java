package org.chuz.pooherencia;

public class EjemploHerencia {

    public static void main(String[] args) {


        System.out.println("=====ISTANCIA ALUMNO====");
        Alumno alumno = new Alumno();


        alumno.setNombre("Chuz");
        alumno.setApellido("Regis");
        alumno.setInstitucion("IPN");
        alumno.setNotaCatellano(5.5);
        alumno.setNotaMatematica(4.3);
        alumno.setNotaHIstoria(8.8);



        System.out.println("=====ISTANCIA ALUMNO INTERNACIONAL====");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Chads");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(12);
        alumnoInternacional.setInstitucion("IPNS");
        alumnoInternacional.setNotaIdiomas(8);
        alumnoInternacional.setNotaCatellano(7);



        System.out.println("=====ISTANCIA PROFESOR INTERNACIONAL====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAssignatura("Matematicas");


        System.out.println(alumno.getNombre()+ " " + alumno.getApellido()+
                " "+ alumno.getInstitucion());
        System.out.println("Profesor : "+ profesor.getAssignatura());


    Class claseAlumnoInternacional = alumnoInternacional.getClass();

    while(claseAlumnoInternacional.getSuperclass() != null){
        String hija = claseAlumnoInternacional.getName();
        String padre = claseAlumnoInternacional.getSuperclass().getName();

        System.out.println(hija );
        System.out.println(padre);
        claseAlumnoInternacional = claseAlumnoInternacional.getSuperclass();

    }




    }





}
