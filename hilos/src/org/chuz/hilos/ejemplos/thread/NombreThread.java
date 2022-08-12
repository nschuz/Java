package org.chuz.hilos.ejemplos.thread;

//heradamos de therad
public class NombreThread  extends Thread{

    //constructor  para daler un un nombre
    public NombreThread(String name) {
        super(name);
    }

    //sobrescribimos el override
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo "+this.getName());

        //aqui hacemos alguna operacion
        for (int i =0; i<10 ; i++){
            //pasa de este hilo no del main
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName());
        }


        System.out.println("Finaliza el hilo");

    }

    public static class EjemploSincroizaciionHilos {

        public static void main(String[] args) {

        }


        //este metodo es estatico porque es copartido por varios hilso
        public static void imprimirFrases(String frase1, String frase2) {
            System.out.println(frase1);

            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(frase2);
        }

    }
}
