import org.chuz.hilos.ejemplos.thread.ruunable.ViajeTarea;

import java.util.Arrays;

public class EjemploInterfacesRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Args: "+ Arrays.toString(args));
        Thread mainthread = Thread.currentThread();
/*
        Runnable viaje = new Runnable() {

            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    System.out.println(i + " - "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmen me voy de viaje a : "+Thread.currentThread().getName());
            }

            };

 */


        //utilizando epresiones lambda
        Runnable viaje = ()->{

                for (int i=0; i<10; i++){
                    System.out.println(i + " - "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmen me voy de viaje a : "+Thread.currentThread().getName());
            System.out.println(mainthread.getState());
        };


        //Cremoa la isnatncia y le pasamos la isntacia que implenta la intefaz
        Thread t1 = new Thread(viaje ,"Isla de Pascua");
        Thread t2 = new Thread(viaje, "Paris");
        Thread t3 = new Thread(viaje, "Patagonia");

        t1.start();
        t2.start();
        t2.start();

        //uno el therad princial con t1 asi esperamos que finalice todos
        t1.join();
        t2.join();
        t3.join();



        //aparece al inicio
        System.out.println("Continuando con la ejecucuion del main");


    }
}
