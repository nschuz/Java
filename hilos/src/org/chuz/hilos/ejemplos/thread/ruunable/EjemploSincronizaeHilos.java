package org.chuz.hilos.ejemplos.thread.ruunable;

public class EjemploSincronizaeHilos {

    public static void main(String[] args) {

        new Thread(new ImprimirFrases("Hola", "quetal! ")).start();
        new Thread(new ImprimirFrases("Quien ere ?" , "tu?")).start();
        new Thread(new ImprimirFrases("Muchas ","gracias  amigo")).start();


    }


    //con el modificado syncronixed hace que entra un hilo y hace esperar a los hilos
    //es importante que nosotros  harcodemos el orde
    public synchronized   static void ImprimirFrasesMethod (String frase1, String frase2){
        System.out.println(frase1);

        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(frase2);
    }

}
