package org.chuz.hilos.ejemplos.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {

    public static void main(String[] args) throws InterruptedException {

        //Executor esjecuta una tera
        //Executors nos pemrite ejecutar y relizar un seguimeinto medinate un callable

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = ()->{
            System.out.println("INicio de la tarea.... ");
            // es lo mismo a thrad.sepel
            try {

                System.out.println("Nombre del thread: "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);

            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la atrea");
        };

        //registramos la traea
        executor.submit(tarea);
        //apagamso el executor
        executor.shutdown();
        System.out.println("Continuando con la ejecuion del metodo main 1");

        //eséra que finlie las tareas o la as cierra por timeout
        //deja el main en espera y epera que el excutor termina
        executor.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continueando con ala jeeucuind dle metodos main 2");




    }
}
