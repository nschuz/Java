import org.chuz.hilos.ejemplos.thread.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {


        Thread hilo = new NombreThread("Jhon Doe");

        //inicmaos el hilo con start este metod internamiente llama el run
        hilo.start();

        //paua al mhilo main
        //Thread.sleep(100);
        //incia hilo1 Jhon y cuando termina incia el hilo2
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();


        NombreThread hilo23= new NombreThread("Pepe");
        hilo23.start();

        System.out.println(hilo.getState());


    }
}

