package org.chuz.hilos.ejemplos.thread.sync;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorCOnsumidorJava8 {

    public static void main(String[] args) {

        Panaderia p  = new Panaderia();
        new Thread( () -> {

            for (int i=0; i<10 ; i++){
                p.hornear("Pna n: "+i);
                //simular que esta hacinedo el pan con delay
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
        new Thread(()->{
            for (int i=0; i<10; i++){
                p.consumir();
            }
        }).start();


    }
}
