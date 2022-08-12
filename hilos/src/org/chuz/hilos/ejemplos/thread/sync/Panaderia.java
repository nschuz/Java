package org.chuz.hilos.ejemplos.thread.sync;

public class Panaderia {

    private String pan;
    private boolean disponible;


    // metodo que entra los hilos panaderos
    public synchronized void hornear(String masa){

        //mietsra este diponibl esperamos
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.pan=masa;
        System.out.println("El panadero hornea el pan: "+this.pan);
        this.disponible = true;
        //notifamos al cliente
        notify();
    }


    public synchronized String consumir (){
        //epesrar jasta que se fabrique el pan
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("CLiente consume pana: "+this.pan);
        this.disponible=false;
        notify();
        return this.pan;
    }





}
