package org.chuz.hilos.ejemplos.thread.timer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaPeriodo {


    public static void main(String[] args) {


        Toolkit toolkit  = Toolkit.getDefaultToolkit();

        //otra froma de untilizar  un contador como varibles
        //AtomicINtefger lo pdoemos utilziar de froma cocuntente sin bloqueo y se puede utilizar dentro
        AtomicInteger contador = new AtomicInteger(3);

        //int contador = 3;
        //podmeo sutilizarlo si es final pero seria constante , una solucion es poenrla dentro de la clase
        //no podmeos utlizar una varible extenar dentro de una una implentacion de una clas eanonima o al vuelo
        Timer timer = new Timer();

        //impentamos al vuelo
        timer.schedule(new TimerTask() {
            /// si lo ponemos dentro del clase anonima si pdoemos utilizar es avarible
            //int contador = 3;



            @Override
            public void run() {
                int  i = contador.getAndDecrement();
                if (i>0){
                    //genraos un sonido
                    toolkit.beep();
                    System.out.println("Tarea periddica en: "+ new Date() + "  nombre del thread: "
                            + Thread.currentThread().getName());
                    //contador --;
                }else{
                    System.out.println("Finaliza el timpo ");
                    timer.cancel();
                }
                //pdemos cacelar el timer eeste recurso para que finalice
                //timer.cancel();
            }
        },5000,10000);

        System.out.println("Agdenamos una tera para 5 segundos  ...");
    }
}
