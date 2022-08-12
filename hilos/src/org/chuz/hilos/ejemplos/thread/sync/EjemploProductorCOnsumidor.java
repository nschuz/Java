package org.chuz.hilos.ejemplos.thread.sync;

public class EjemploProductorCOnsumidor {

    public static void main(String[] args) {

        Panaderia p  = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();


    }
}
