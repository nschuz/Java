package org.chuz.hilos.ejemplos.thread.executor;

import org.chuz.hilos.ejemplos.thread.sync.Consumidor;
import org.chuz.hilos.ejemplos.thread.sync.Panaderia;
import org.chuz.hilos.ejemplos.thread.sync.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorFuturePoolConsumidor {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //Executor esjecuta una tera
        //Executors nos pemrite ejecutar y relizar un seguimeinto medinate un callable

        //si tenmos muchas tareas podemos utilizar
        // con fixed thtereas se ejecutan al mismo tiempo por el tamño del pool
        ThreadPoolExecutor executor =(ThreadPoolExecutor)Executors.newFixedThreadPool(2);

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor  = new Consumidor(p);


        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);


        System.out.println("Tamño del pool: "+executor.getPoolSize());
        System.out.println("Cantidad de tarea en cola: "+executor.getQueue().size());


        //apagamso el executor
        executor.shutdown();
        System.out.println("Continuando con la ejecuion del metodo main 1");


    }
}
