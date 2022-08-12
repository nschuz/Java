package org.chuz.hilos.ejemplos.thread.ruunable;

//impentamos de Runnables
//es la mejor opcion porque es mas desacoplada
public class ViajeTarea  implements Runnable{

    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(i + " - "+nombre);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalmen me voy de viaje a : "+this.nombre);
    }
}
