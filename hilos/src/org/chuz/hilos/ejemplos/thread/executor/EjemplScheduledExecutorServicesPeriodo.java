package org.chuz.hilos.ejemplos.thread.executor;

import java.util.concurrent.*;

public class EjemplScheduledExecutorServicesPeriodo {


    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);


        CountDownLatch lock = new CountDownLatch(5);


       Future<?> future=  executor.scheduleAtFixedRate(()->{

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Hola mundo tarea....");

        }, 1000, 2000,TimeUnit.MILLISECONDS);


        ///TimeUnit.SECONDS.sleep(10);
        //bloque al main
        lock.await();
        future.cancel(true);
        System.out.println("Alguna otra tarea en el main .... ");

        //se apaga despues que termine los 10 del thread principañ
        executor.shutdown();


    }
}
