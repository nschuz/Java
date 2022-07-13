package org.chuz.pooherencia;

public class Profesor  extends Persona{

    private String assignatura;



    public Profesor(){
        System.out.println("Inicializando constructor profesor.... ");
    }


    public String getAssignatura() {
        return assignatura;
    }

    public void setAssignatura(String assignatura) {
        this.assignatura = assignatura;
    }
}
