package main;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner sc= new Scanner(System.in);

    //rreglos para almacenar el equipo
    static ArrayList<Persona> persona = new ArrayList<Persona>();

    //Aqui estamos usando el polimorfismos
    //lo estamos haciedno golbal para poderlo ocupar con los distinto smetodos
    static  Persona  futbolista1 = new Futbolista("chuz","Regis",20,7,"Delanatero");
    static  Persona  furbolista2 = new Futbolista("Mike", "Medina", 20, 20,"defensor");
    static Persona entrenador = new Entrenador("Joaquin","Vladez",50,"Defensiva");
    static  Persona doctor = new Medico("Juan","Regis",60,"Lic en medicina",20);


    public static void main(String[] args) {

        //llenmaos nuestor arreglo dinamico
        persona.add(futbolista1);
        persona.add(furbolista2);
        persona.add(entrenador);
        persona.add(doctor);

        menu();

    }

    public static  void  menu (){
        int opcion;
        do {
            System.out.println("\tMenu");
            System.out.println("1. Viaje de Equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar Lesion");
            System.out.println("7. Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1://Viaje de equipo
                    System.out.println("");
                    vijatEquipo();
                    break;

                case 2: //entrenmaineot
                    System.out.println("");
                    entrenarEquipo();
                    break;

                case  3: //partido de futbol
                    System.out.println("");
                    partidoFutbol();
                    break;

                case  4: //Planificar entrenamient
                    System.out.println("");
                planificarEntrenamiento();
                    break;

                case 5: //Entreista
                    System.out.println("");
                    entrevista();
                    break;

                case 6 : //curat lesionsout
                    System.out.println("");
                    curarLesion();
                    break;

                case 7 : //salir
                    break;

                default:
                    System.out.println("Opcion equivocada");
            }

        }while (opcion!=7);
    }

    public  static  void vijatEquipo(){
        for (Persona eqipo: persona) {
            System.out.println(eqipo.getNombre()+" "+eqipo.getApellidos()+"-> ");
            eqipo.viajar();
        }
    }

    public  static  void  entrenarEquipo (){
        //gracias al polimrofimso
        for (Persona eqipo: persona) {
            System.out.println(eqipo.getNombre()+" "+eqipo.getApellidos()+"-> ");
            eqipo.entrenamiento();
        }
    }

    public  static  void partidoFutbol(){
        for (Persona eqipo: persona) {
            System.out.println(eqipo.getNombre()+" "+eqipo.getApellidos()+"-> ");
            eqipo.partidoFutbol();
        }
    }

    public static  void planificarEntrenamiento(){
        System.out.println(entrenador.getNombre() +" " +entrenador.getApellidos());
        //hicimos un up castin en entreneador lo hicimos perosna

        //necesito hacer un dowcasting para usar ese metodo
        ((Entrenador)entrenador).entrenamiento();


    }

    public static  void entrevista(){
        //igual neecsitamos hacer un downcasting
        System.out.println(futbolista1.getNombre() +" "+ futbolista1.getApellidos());

        //ncesitamos hacer un down castion porque hicmos el tippo persona
        ((Futbolista)futbolista1).entrevista();

    }

    public static  void curarLesion(){
        System.out.println(doctor.getNombre()+" "+doctor.getApellidos());
        ((Medico)doctor).curarLesion();
    }



}
