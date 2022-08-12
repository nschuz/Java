package org.chuz.hilos.ejemplos.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTarea {


    public static void main(String[] args) {


        Timer timer = new Timer();
        //impentamos al vuelo
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: "+ new Date() + "  nombre del thread: "
                + Thread.currentThread().getName());
                System.out.println("Finaliza el timpo ");
                //pdemos cacelar el timer eeste recurso para que finalice
                timer.cancel();
            }
        },5000);

        System.out.println("Agdenamos una tera para 5 segundos  ...");
    }
}
