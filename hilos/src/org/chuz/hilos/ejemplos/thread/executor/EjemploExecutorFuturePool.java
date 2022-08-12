package org.chuz.hilos.ejemplos.thread.executor;

import java.util.concurrent.*;

public class EjemploExecutorFuturePool {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //Executor esjecuta una tera
        //Executors nos pemrite ejecutar y relizar un seguimeinto medinate un callable

        //si tenmos muchas tareas podemos utilizar
        // con fixed thtereas se ejecutan al mismo tiempo por el tamño del pool
        ThreadPoolExecutor executor =(ThreadPoolExecutor)Executors.newFixedThreadPool(2);

        System.out.println("Tamño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tarea en cola: "+executor.getQueue().size());

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


        Callable<Integer> tarea2 = () ->{
            System.out.println("INiciando tarea  2");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        //registramos la traea
        //como es de tipo ruunable y no devuelve nada utilizamos el ?
         Future<?> resultado = executor.submit(tarea);
         Future<?> resultado2 = executor.submit(tarea);
         Future<?> resultado3 = executor.submit(tarea2);

        //apagamso el executor
        executor.shutdown();
        System.out.println("Continuando con la ejecuion del metodo main 1");

        //seejcutan en tirno por la etamño del pool que es uno es decir la tarea 1 y luego l aatrea 2
        while (!(resultado.isDone() && resultado3.isDone() && resultado2.isDone())){
            System.out.printf("resultado1: %s - resultado2: %s - resultado3: %s%n",
                    resultado.isDone()?"finalizo":"en proceso", resultado2.isDone()?"finalizo":"en proceso",
                    resultado3.isDone()?"finalizo":"en proceso");
            TimeUnit.MILLISECONDS.sleep(1000);
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
