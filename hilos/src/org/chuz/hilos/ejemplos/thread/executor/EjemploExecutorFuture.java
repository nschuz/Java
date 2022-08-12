package org.chuz.hilos.ejemplos.thread.executor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //Executor esjecuta una tera
        //Executors nos pemrite ejecutar y relizar un seguimeinto medinate un callable

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = ()->{
            System.out.println("INicio de la tarea.... ");
            // es lo mismo a thrad.sepel
            try {

                System.out.println("Nombre del thread: "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);

            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la atrea");

            return "THAT WAS EPIC!";

        };

        //registramos la traea
        //como es de tipo ruunable y no devuelve nada utilizamos el ?
         Future<?> resultado = executor.submit(tarea);
        //apagamso el executor
        executor.shutdown();
        System.out.println("Continuando con la ejecuion del metodo main 1");

        while (!resultado.isDone()){
            System.out.println("EJECUTANDO LA TAREA......");
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        //System.out.println(resultado.isDone());
        //get no es bueno bloquea el hilo hasta que finaliza la atrea
       //Es similar a join
        System.out.println(resultado.get());
        //Aqui ya termino
        System.out.println("Continuando ");
        System.out.println(resultado.isDone());



    }
}
